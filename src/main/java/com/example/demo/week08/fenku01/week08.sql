#创建数据库表数据
CREATE DATABASE IF NOT EXISTS `db0`;
USE `db0`;
DROP TABLE IF EXISTS `ao_order_0`;
CREATE TABLE `ao_order_0` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_1`;
CREATE TABLE `ao_order_1` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_3`;
CREATE TABLE `ao_order_3` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_4`;
CREATE TABLE `ao_order_4` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_5`;
CREATE TABLE `ao_order_5` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_6`;
CREATE TABLE `ao_order_6` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_7`;
CREATE TABLE `ao_order_7` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_8`;
CREATE TABLE `ao_order_8` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_9`;
CREATE TABLE `ao_order_9` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;



DROP TABLE IF EXISTS `ao_order_10`;
CREATE TABLE `ao_order_10` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;



DROP TABLE IF EXISTS `ao_order_11`;
CREATE TABLE `ao_order_11` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_12`;
CREATE TABLE `ao_order_12` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_13`;
CREATE TABLE `ao_order_13` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_14`;
CREATE TABLE `ao_order_14` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_15`;
CREATE TABLE `ao_order_15` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


##db1


CREATE DATABASE IF NOT EXISTS `db1`;
USE `db1`;

DROP TABLE IF EXISTS `ao_order_0`;
CREATE TABLE `ao_order_0` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_1`;
CREATE TABLE `ao_order_1` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_3`;
CREATE TABLE `ao_order_3` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_4`;
CREATE TABLE `ao_order_4` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_5`;
CREATE TABLE `ao_order_5` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_6`;
CREATE TABLE `ao_order_6` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `ao_order_7`;
CREATE TABLE `ao_order_7` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_8`;
CREATE TABLE `ao_order_8` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_9`;
CREATE TABLE `ao_order_9` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;



DROP TABLE IF EXISTS `ao_order_10`;
CREATE TABLE `ao_order_10` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;



DROP TABLE IF EXISTS `ao_order_11`;
CREATE TABLE `ao_order_11` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_12`;
CREATE TABLE `ao_order_12` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_13`;
CREATE TABLE `ao_order_13` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_14`;
CREATE TABLE `ao_order_14` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;


DROP TABLE IF EXISTS `ao_order_15`;
CREATE TABLE `ao_order_15` (
	order_id INT NOT NULL COMMENT '订单ID',
	order_sn BIGINT NOT NULL COMMENT '订单编号',
	customer_id INT NOT NULL COMMENT '下单人ID',
	shipping_user VARCHAR(10) NOT NULL COMMENT '收货人姓名',
	address VARCHAR(100) NOT NULL COMMENT '地址',
	payment_method TINYINT NOT NULL COMMENT '支付方式：1现金，2余额，3网银，4支付宝，5微信',
	order_money DECIMAL(8,2) NOT NULL COMMENT '订单金额',
	shipping_comp_name VARCHAR(10) COMMENT '快递公司名称',
	shipping_sn VARCHAR(50) COMMENT '快递单号',
	create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间',
	shipping_time DATETIME COMMENT '发货时间',
	pay_time DATETIME COMMENT '支付时间',
	receive_time DATETIME COMMENT '收货时间',
	order_status TINYINT NOT NULL DEFAULT 0 COMMENT '订单状态',
	modified_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY pk_orderid(order_id) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;






