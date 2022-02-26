package com.example.demo.db05.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月12日 16:42
 */
public class JdbcHikariUtil {

//    private static final DataSource dataSource = new HikariDataSource(new HikariConfig("src/main/resources/hikari.properties"));

    private static final DataSource dataSource = new HikariDataSource(new HikariConfig("hikari.properties"));

    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
