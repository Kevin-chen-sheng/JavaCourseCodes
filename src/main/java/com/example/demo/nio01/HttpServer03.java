package com.example.demo.nio01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年01月10日 11:12
 */
public class HttpServer03 {
    public static void main(String[] args) throws IOException {
        //获取系统处理器个数，作为线程池数量
        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(nThreads); //8

//        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
//                .setNameFormat("demo-pool-%d").build();

        ExecutorService pool = new ThreadPoolExecutor(nThreads, nThreads*2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

//        ExecutorService pool = new ThreadPoolExecutor(nThreads, nThreads*2,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(1024), new MyThreadFactory(), new ThreadPoolExecutor.AbortPolicy());//自定义线程工厂名称

//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 2);
        final ServerSocket serverSocket = new ServerSocket(8803);
        while (true){
            final Socket socket = serverSocket.accept();
            pool.execute(()->{
                service(socket);
                System.out.println(Thread.currentThread().getName());
            });
//            service(socket);
        }


    }
    static class MyThreadFactory implements ThreadFactory{
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private ThreadGroup group = null;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private String namePrefix = null;
        MyThreadFactory() {
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
            namePrefix = "线程池-" + poolNumber.getAndIncrement() + "-线程-";
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(group, r,
                    namePrefix + threadNumber.getAndIncrement(),
                    0);
            if (t.isDaemon()) {
                //设置守护线程
                t.setDaemon(false);
            }
            if (t.getPriority() != Thread.NORM_PRIORITY) {
                //设置默认优先级
                t.setPriority(Thread.NORM_PRIORITY);
            }
            return t;
        }
    }

    private static void service(Socket socket) {
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello,nio";
            printWriter.println("Content-Length:"+body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
