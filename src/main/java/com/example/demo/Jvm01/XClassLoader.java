package com.example.demo.Jvm01;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年01月04日 14:41
 */
public class XClassLoader extends ClassLoader{
    public static void main(String[] args) throws Exception {

        // 启动类加载器
        /*URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        System.out.println("启动类加载器");
        for(URL url : urls) {
            System.out.println(" ==> " +url.toExternalForm());
        }*/

        // 相关参数
        final String className = "Hello";
        final String methodName = "hello";
        // 创建类加载器
        ClassLoader classLoader = new XClassLoader();
        // 加载相应的类
        // loadClass其中会调用findClass方法
        Class<?> clazz = classLoader.loadClass(className);
        // 看看里面有些什么方法
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(clazz.getSimpleName() + "." + m.getName());
        }
        // 创建对象
        Object instance = clazz.getDeclaredConstructor().newInstance();
        // 获取实例方法
        Method method = clazz.getMethod(methodName);
        // 调用实例方法
        method.invoke(instance);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 如果支持包名, 则需要进行路径转换
        String resourcePath = name.replace(".", "/");
        // 文件后缀
        final String suffix = ".xlass";
        // 获取输入流
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resourcePath + suffix);
        try {
            // 读取数据
            int length = inputStream.available();
            byte[] byteArray = new byte[length];
            inputStream.read(byteArray);
            // 转换
            byte[] classBytes = decode(byteArray);
            // 通知底层定义这个类
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        } finally {
            close(inputStream);
        }
    }

    // 解码
    private static byte[] decode(byte[] byteArray) {
        byte[] targetArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            targetArray[i] = (byte) (255 - byteArray[i]);
        }
        return targetArray;
    }

    // 关闭
    private static void close(Closeable res) {
        if (null != res) {
            try {
                res.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
