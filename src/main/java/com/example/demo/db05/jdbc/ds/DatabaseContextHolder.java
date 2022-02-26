package com.example.demo.db05.jdbc.ds;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月25日 16:59
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
    public static String getCustomerType() {
        return contextHolder.get();
    }
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
