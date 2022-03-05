package com.example.demo.week08.fenku01;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 13:32
 */
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println(DataSourceContextHolder.getDbType());
        return DataSourceContextHolder.getDbType();
    }
}
