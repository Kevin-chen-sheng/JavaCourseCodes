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
public class BankFreeze {
//    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键 自增列',
//            `customer_id` int(11) NOT NULL COMMENT '用户编号',
//            `account_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '账户类型：1 人民币账户，2 美元账户',
//            `amount` bigint(20) NOT NULL COMMENT '客户余额 单位 分',
//            `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//            `is_validate` tinyint(4) NOT NULL DEFAULT '1' COMMENT '数据是否有效标识：1有效数据，2 无效数据',
//            `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
    @TableId
    private Integer id;

    private Integer customerId;
    private Integer accountType;
    private Long amount;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Integer isValidate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
