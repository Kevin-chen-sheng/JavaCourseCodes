package com.example.demo.db05.jdbc.ds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月25日 16:57
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHandler.getDataSource();
//        return DatabaseContextHolder.getCustomerType();
    }
}
