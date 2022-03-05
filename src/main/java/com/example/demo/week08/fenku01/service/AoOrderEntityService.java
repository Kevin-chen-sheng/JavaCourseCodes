package com.example.demo.week08.fenku01.service;

import com.example.demo.week08.fenku01.entity.AoOrderEntity;

import java.sql.SQLException;
import java.util.List;

/**
 * @author da
 * @date 2022年03月05日 15:11
 */
public interface AoOrderEntityService {
    List<AoOrderEntity> getAoOrderList();
    boolean save(AoOrderEntity ao);
    void processWithXA() throws SQLException;
}