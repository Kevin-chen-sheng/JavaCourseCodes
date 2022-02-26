package com.example.demo.db05.jdbc;

/**
 * @author da
 * @version 1.0
 * @description: 通过JDBC工具类和PreparedStatement实现增删改查(PreparedStatement类为Statement的子类)
 * 导入100万条数据
 * @date 2022年02月12日 16:11
 */

import com.example.demo.db05.jdbc.ds.ano.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PreparedStatementDemo {
    private static String sqlStatement;
    public static void main(String[] args) throws SQLException {
        long t1 = System.currentTimeMillis();
        //通过工具类获取数据库连接对象
        Connection con = JDBCUtil.getConnection();
        //Hikari
//        Connection con = JdbcHikariUtil.getConnection();
        //通过连接创建数据库执行对象
        PreparedStatement ps = null;
        //为查询的结果集准备接收对象
        ResultSet rs = null;
        //查询
//        sqlStatement = "SELECT * FROM DEPT WHERE DEPTNO = ?";
//        ps = con.prepareStatement(sqlStatement);
//        ps.setObject(1, "10");
//        qry(ps,rs);
        //增加
        sqlStatement = "INSERT INTO ao_order VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ps = con.prepareStatement(sqlStatement);
        for (int i = 0; i <1000000; i++) {
            ps.setObject(1, 5000);//order_sn
            ps.setObject(2, 4343);//customer_id
            ps.setObject(3, "SHAOXING");//shipping_user
            ps.setObject(4, "中山大道西");//address
            ps.setObject(5, 1);//payment_method
            ps.setObject(6, 6565.78);//order_money
            ps.setObject(7, "中通");//shipping_comp_name
            ps.setObject(8, "12123214314324");//shipping_sn
            ps.setObject(9, new Date());//create_time
            ps.setObject(10, new Date());//shipping_time
            ps.setObject(11, new Date());//pay_time
            ps.setObject(12, new Date());//receive_time
            ps.setObject(13, 1);//order_status
            ps.setObject(14, new Date());//modified_time

            System.out.println("插入执行结果:"+update(ps,sqlStatement));
        }

        /*
         *
  order_id INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  order_sn BIGINT UNSIGNED NOT NULL COMMENT '订单编号',
  customer_id INT UNSIGNED NOT NULL COMMENT '下单人ID',
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
         */
//        ps = con.prepareStatement(sqlStatement);
//        ps.setInt();//order_sn


        //更新
//        sqlStatement = "UPDATE DEPT SET loc=? WHERE DEPTNO = ?";
//        ps = con.prepareStatement(sqlStatement);
//        ps.setObject(1, "SHAOXING");
//        ps.setObject(2, "50");
//        System.out.println("更新执行结果:"+update(ps,sqlStatement));
//        //删除
//        sqlStatement = "DELETE FROM DEPT WHERE DEPTNO = ?";
//        ps = con.prepareStatement(sqlStatement);
//        ps.setObject(1, "50");
//        System.out.println("删除执行结果:"+update(ps,sqlStatement));
        JDBCUtil.closeResource(con, ps, rs);

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
    }

    public static void method1(String[] args) throws SQLException {
        long t1 = System.currentTimeMillis();
        //通过工具类获取数据库连接对象
        Connection con = JDBCUtil.getConnection();
        //Hikari
//        Connection con = JdbcHikariUtil.getConnection();
        //通过连接创建数据库执行对象
        PreparedStatement ps = null;
        //为查询的结果集准备接收对象
        ResultSet rs = null;
        //增加
        sqlStatement = "INSERT INTO ao_order VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        //事务提交
        con.setAutoCommit(false);
        ps = con.prepareStatement(sqlStatement);
        for (int i = 0; i <1000000; i++) {
            ps.setObject(1, 5000);//order_sn
            ps.setObject(2, 4343);//customer_id
            ps.setObject(3, "SHAOXING");//shipping_user
            ps.setObject(4, "中山大道西");//address
            ps.setObject(5, 1);//payment_method
            ps.setObject(6, 6565.78);//order_money
            ps.setObject(7, "中通");//shipping_comp_name
            ps.setObject(8, "12123214314324");//shipping_sn
            ps.setObject(9, new Date());//create_time
            ps.setObject(10, new Date());//shipping_time
            ps.setObject(11, new Date());//pay_time
            ps.setObject(12, new Date());//receive_time
            ps.setObject(13, 1);//order_status
            ps.setObject(14, new Date());//modified_time

            System.out.println("插入执行结果:"+update(ps,sqlStatement));
        }
        con.commit();
        JDBCUtil.closeResource(con, ps, rs);

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
    }
    /**
     * 三、批处理：
     * 特别注意:需要url参数加:rewriteBatchedStatements=true
     * url范例: jdbc:mysql://127.0.0.1/XXX?characterEncoding=UTF-8&rewriteBatchedStatements=true
     */
    public static void method2(String[] args) throws SQLException {
        long t1 = System.currentTimeMillis();
        //通过工具类获取数据库连接对象
        Connection con = JDBCUtil.getConnection();
        //Hikari
//        Connection con = JdbcHikariUtil.getConnection();
        //通过连接创建数据库执行对象
        PreparedStatement ps = null;
        //为查询的结果集准备接收对象
        ResultSet rs = null;
        //增加
        sqlStatement = "INSERT INTO ao_order VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        //事务提交
        ps = con.prepareStatement(sqlStatement);
        for (int i = 0; i <1000000; i++) {
            ps.setObject(1, 5000);//order_sn
            ps.setObject(2, 4343);//customer_id
            ps.setObject(3, "SHAOXING");//shipping_user
            ps.setObject(4, "中山大道西");//address
            ps.setObject(5, 1);//payment_method
            ps.setObject(6, 6565.78);//order_money
            ps.setObject(7, "中通");//shipping_comp_name
            ps.setObject(8, "12123214314324");//shipping_sn
            ps.setObject(9, new Date());//create_time
            ps.setObject(10, new Date());//shipping_time
            ps.setObject(11, new Date());//pay_time
            ps.setObject(12, new Date());//receive_time
            ps.setObject(13, 1);//order_status
            ps.setObject(14, new Date());//modified_time
            ps.addBatch();
//            System.out.println("插入执行结果:"+update(ps,sqlStatement));
        }
        ps.executeBatch();
        JDBCUtil.closeResource(con, ps, rs);

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
    }
    /**
     * 四、分小批次处理并且分批执行
     * 结论:加事务时间无影响，但是分批次能提供效率的增加
     */
    public static void method3(String[] args) throws SQLException {
        long t1 = System.currentTimeMillis();
        //通过工具类获取数据库连接对象
        Connection con = JDBCUtil.getConnection();
        //Hikari
//        Connection con = JdbcHikariUtil.getConnection();
        //通过连接创建数据库执行对象
        PreparedStatement ps = null;
        //为查询的结果集准备接收对象
        ResultSet rs = null;
        //增加
        sqlStatement = "INSERT INTO ao_order VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        ps = con.prepareStatement(sqlStatement);

        int size = 1000000;
        for (int i = 0; i < size; i++) {
            ps.setObject(1, 5000);//order_sn
            ps.setObject(2, 4343);//customer_id
            ps.setObject(3, "SHAOXING");//shipping_user
            ps.setObject(4, "中山大道西");//address
            ps.setObject(5, 1);//payment_method
            ps.setObject(6, 6565.78);//order_money
            ps.setObject(7, "中通");//shipping_comp_name
            ps.setObject(8, "12123214314324");//shipping_sn
            ps.setObject(9, new Date());//create_time
            ps.setObject(10, new Date());//shipping_time
            ps.setObject(11, new Date());//pay_time
            ps.setObject(12, new Date());//receive_time
            ps.setObject(13, 1);//order_status
            ps.setObject(14, new Date());//modified_time

            ps.addBatch();
            if(i%10000==0||i==size-1){ //1万次一条，或者最后一次进行提交。
                ps.executeBatch();
                ps.clearBatch(); /**清除缓存*/
                System.out.println("执行到第"+i/10000+"外循环");
            }
        }


        JDBCUtil.closeResource(con, ps, rs);

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
    }
    /**
     * 5、事务+批处理并且分批执行
     * 结论:加事务时间无影响，但是分批次能提供效率的增加
     */
    public static void method4(String[] args) throws SQLException {
        long t1 = System.currentTimeMillis();
        //通过工具类获取数据库连接对象
        Connection con = JDBCUtil.getConnection();
        //Hikari
//        Connection con = JdbcHikariUtil.getConnection();
        //通过连接创建数据库执行对象
        PreparedStatement ps = null;
        //为查询的结果集准备接收对象
        ResultSet rs = null;
        //增加
        sqlStatement = "INSERT INTO ao_order VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        con.setAutoCommit(false);

        ps = con.prepareStatement(sqlStatement);

        int size = 1000000;
        for (int i = 0; i < size; i++) {
            ps.setObject(1, 5000);//order_sn
            ps.setObject(2, 4343);//customer_id
            ps.setObject(3, "SHAOXING");//shipping_user
            ps.setObject(4, "中山大道西");//address
            ps.setObject(5, 1);//payment_method
            ps.setObject(6, 6565.78);//order_money
            ps.setObject(7, "中通");//shipping_comp_name
            ps.setObject(8, "12123214314324");//shipping_sn
            ps.setObject(9, new Date());//create_time
            ps.setObject(10, new Date());//shipping_time
            ps.setObject(11, new Date());//pay_time
            ps.setObject(12, new Date());//receive_time
            ps.setObject(13, 1);//order_status
            ps.setObject(14, new Date());//modified_time

            ps.addBatch();
            if(i%10000==0||i==size-1){ //1万次一条，或者最后一次进行提交。
                ps.executeBatch();
                ps.clearBatch(); /**清除缓存*/
                System.out.println("执行到第"+i/10000+"外循环");
            }
        }

        con.commit();

        JDBCUtil.closeResource(con, ps, rs);

        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
    }
    /**
     * 查询
     * @param sta
     * @param rs
     * @throws SQLException
     */
    //动态切换数据源版本 1.0
    @DataSource(value = "slave")
    private static void qry(PreparedStatement sta,ResultSet rs) throws SQLException {
        rs = sta.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getObject("deptno"));
        }
    }
    /**
     * 增删改
     * @param sta
     * @param sql
     * @return
     * @throws SQLException
     */
    @DataSource
    private static int update(PreparedStatement sta,String sql) throws SQLException {
        return sta.executeUpdate();
    }
}
