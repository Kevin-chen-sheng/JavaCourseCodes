package com.example.demo.concurrency03.conc0303;

import java.util.Random;
import java.util.concurrent.*;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * <p>
 * 一个简单的代码参考：
 */
public class Homework03 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法

//        int result = sum(); //这是得到的返回值

        // 第一种
//        Integer result1 = CompletableFuture.supplyAsync(()->{return null;}).thenApplyAsync(v -> sum()).join();

        // 第二种
//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//            return sum();
//        });
//        Integer join = completableFuture.join();

        //第三种
//        Integer result3 = CompletableFuture.supplyAsync(()->{return 36;}).thenApplyAsync(v -> fibo(v)).join();

        // 第四种
//        ExecutorService executor = Executors.newCachedThreadPool();
//        Future<Integer> result4 = executor.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return sum();
//            }
//        });
//        executor.shutdown();
//        try {
//            System.out.println("异步计算结果为：" + result4.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        //第五种
//        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return sum();
//            }
//        });
//        new Thread(task).start();
//        try {
//            System.out.println("异步计算结果为：" + task.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        //第六种
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return sum();
            }
        });
        executor.submit(task);
        executor.shutdown();
        try {
            System.out.println("异步计算结果为：" + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 确保  拿到result 并输出
//        System.out.println("异步计算结果为：" + result4);

        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2) {
            return 1;
        }
        return fibo(a - 1) + fibo(a - 2);
    }
}
