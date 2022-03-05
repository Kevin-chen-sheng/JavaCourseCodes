package com.example.demo.week08.fenku01;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 13:29
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }
    public static String getDbType() {
        return ((String) contextHolder.get());
    }
    public static void clearDbType() {
        contextHolder.remove();
    }
}

