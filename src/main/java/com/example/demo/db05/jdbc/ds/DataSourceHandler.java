package com.example.demo.db05.jdbc.ds;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月26日 11:01
 */
public class DataSourceHandler {

    private static ThreadLocal<String> handlerThreadLocal = new ThreadLocal<>();

    /**
     * 提供给AOP去设置当前的线程的数据源的信息
     * @param dataSource
     */
    public static void putDataSource(String dataSource) {
        handlerThreadLocal.set(dataSource);
    }

    /**
     * 提供给AbstractRoutingDataSource的实现类，通过key选择数据源
     * @return
     */
    public static String getDataSource() {
        return handlerThreadLocal.get();
    }

    /**
     * 清空, 使用默认数据源
     */
    public static void remove() {
        handlerThreadLocal.remove();
    }
}

