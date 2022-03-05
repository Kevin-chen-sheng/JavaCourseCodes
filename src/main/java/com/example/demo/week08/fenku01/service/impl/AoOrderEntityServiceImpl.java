package com.example.demo.week08.fenku01.service.impl;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 15:05
 */

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.week08.fenku01.SnowUtil;
import com.example.demo.week08.fenku01.entity.AoOrderEntity;
import com.example.demo.week08.fenku01.mapper.AoOrderEntityMapper;
import com.example.demo.week08.fenku01.service.AoOrderEntityService;
import com.example.demo.week08.fenku01.xa02.HealthRecord;
import com.example.demo.week08.fenku01.xa02.HealthTask;
import com.example.demo.week08.fenku01.xa02.TransactionTypeHolder;
import io.shardingsphere.transaction.api.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.baomidou.mybatisplus.core.assist.ISqlRunner.SQL;

@Service
public class AoOrderEntityServiceImpl extends ServiceImpl<AoOrderEntityMapper, AoOrderEntity> implements AoOrderEntityService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<AoOrderEntity> getAoOrderList() {
        return baseMapper.selectList(Wrappers.<AoOrderEntity>lambdaQuery());
    }

    @Override
    public boolean save(AoOrderEntity ao) {
        return super.save(ao);
    }

    public boolean xa(AoOrderEntity ao) {
        jdbcTemplate.execute(SQL, (PreparedStatementCallback<Object>) preparedStatement -> {



            return preparedStatement;

        });
        return super.save(ao);
    }

    @Transactional
//    @ShardingTransactionType(TransactionType.XA)
    public void insert(){
        TransactionTypeHolder.set(TransactionType.XA);

    }


    private List<Long> insertHealthRecords() throws SQLException {
        List<Long> result = new ArrayList<>(10);
        jdbcTemplate.execute((ConnectionCallback<Object>) connection-> {
            connection.setAutoCommit(false);

            try {
                for (Long i = 1L; i <= 10; i++) {
                    HealthRecord healthRecord = createHealthRecord(i);
                    insertHealthRecord(healthRecord, connection);

                    HealthTask healthTask = createHealthTask(i, healthRecord);
                    insertHealthTask(healthTask, connection);

                    result.add(healthRecord.getRecordId());

                    //手工抛出异常
                    //throw new SQLException("exception occur!");
                }
                connection.commit();
            } catch (final SQLException ex) {
                connection.rollback();
                throw ex;
            }

            return connection;
        });

        return result;
    }

    private HealthTask createHealthTask(Long i, HealthRecord healthRecord) {
        HealthTask healthTask = new HealthTask();
        healthTask.setRecordId(healthRecord.getRecordId());
        healthTask.setUserId(i);
        return healthTask;
    }

    private HealthRecord createHealthRecord(Long i) {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setUserId(SnowUtil.getId());
        healthRecord.setLevelId(i);

        return healthRecord;
    }

    @Override
    public void processWithXA() throws SQLException {
        TransactionTypeHolder.set(TransactionType.XA);

        insertHealthRecords();
    }

    private void insertHealthRecord(HealthRecord healthRecord, Connection connection) throws SQLException {

        String sql_health_record_insert = "INSERT INTO health_record VALUES(null,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql_health_record_insert, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setLong(1, healthRecord.getUserId());
            preparedStatement.setLong(2, healthRecord.getLevelId() % 5 );
            preparedStatement.setString(3, "Remark" + healthRecord.getUserId());
            preparedStatement.executeUpdate();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    healthRecord.setRecordId(resultSet.getLong(1));
                }
            }
        }

    }

    private void insertHealthTask(HealthTask healthTask, Connection connection) throws SQLException {

        String sql_health_task_insert = "INSERT INTO health_task VALUES(null,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql_health_task_insert, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setLong(1, healthTask.getUserId() % 5 );

            preparedStatement.setLong(2,healthTask.getRecordId());
            preparedStatement.setString(3, "TaskName" + healthTask.getUserId());
            preparedStatement.executeUpdate();

        }

    }


}

