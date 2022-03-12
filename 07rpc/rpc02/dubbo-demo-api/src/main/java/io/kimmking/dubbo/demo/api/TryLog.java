package io.kimmking.dubbo.demo.api;

import cn.org.atool.fluent.mybatis.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:22
 */
@Data
public class TryLog {
//    `tx_no` varchar(64) NOT NULL COMMENT '事务id',
//            `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
    @TableId
    private String tx_no;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
