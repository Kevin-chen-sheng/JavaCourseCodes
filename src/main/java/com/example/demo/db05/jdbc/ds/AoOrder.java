package com.example.demo.db05.jdbc.ds;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月25日 20:43
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description ao_order
 * @author da
 * @date 2022-02-25
 */
@Data
public class AoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 订单编号
     */
    private Long orderSn;

    /**
     * 下单人id
     */
    private Integer customerId;

    /**
     * 收货人姓名
     */
    private String shippingUser;

    /**
     * 地址
     */
    private String address;

    /**
     * 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    private int paymentMethod;

    /**
     * 订单金额
     */
    private BigDecimal orderMoney;

    /**
     * 快递公司名称
     */
    private String shippingCompName;

    /**
     * 快递单号
     */
    private String shippingSn;

    /**
     * 下单时间
     */
    private Date createTime;

    /**
     * 发货时间
     */
    private Date shippingTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 收货时间
     */
    private Date receiveTime;

    /**
     * 订单状态
     */
    private int orderStatus;

    /**
     * 更新时间
     */
    private Date modifiedTime;

    public AoOrder() {}
}
