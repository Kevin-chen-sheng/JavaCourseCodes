package com.example.demo.week08.fenku01;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 14:24
 */
public class SnowUtil {
    private static Snowflake SNOWFLAKE  = IdUtil.createSnowflake(1, 1);

//    private static final Snowflake SNOWFLAKE = Singleton.get(Snowflake.class, 1, 1, true);

    public static Long getId(){
        return SNOWFLAKE.nextId();
    }

}
