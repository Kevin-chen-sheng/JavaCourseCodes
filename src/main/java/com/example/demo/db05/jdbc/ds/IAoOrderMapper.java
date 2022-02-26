package com.example.demo.db05.jdbc.ds;

import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.db05.jdbc.ds.ano.DataSource;

import java.io.Serializable;

/**
 * @author da
 * @date 2022年02月25日 20:53
 */
public interface IAoOrderMapper extends BaseMapper<AoOrder> {
    @Override
    @DataSource
    int insert(AoOrder entity);

    @Override
    @DataSource(value = "slave")
    AoOrder selectById(Serializable id);

}
