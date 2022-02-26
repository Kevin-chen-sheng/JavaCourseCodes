package com.example.demo.db05.jdbc.ds.aop;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.demo.db05.jdbc.ds.DataSourceHandler;
import com.example.demo.db05.jdbc.ds.ano.DataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.lang.reflect.Method;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月26日 11:06
 */
//拦截方法或者类上的注解来确定使用哪一个Datasource
@Aspect
@Component
public class DataSourceHandlerAop {
    private static final Logger log = LoggerFactory.getLogger(DataSourceHandlerAop.class);

    //需要拦截的注解
    @Pointcut("@within(com.example.demo.db05.jdbc.ds.ano.DataSource) || @annotation(com.example.demo.db05.jdbc.ds.ano.DataSource)")
    public void pointcut() {
    }

    /**
     * 在执行具体方法前 确定需要的数据源
     *
     * @param joinPoint
     */
    @Before(value = "pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        //获取方法上的@DataSource注解
        //自己定义的注解，注意sql包上也有这个注解
        DataSource dataSourceAnnotation = method.getAnnotation(DataSource.class);

        if (dataSourceAnnotation == null) {
            //获取对应类上面的注解
            dataSourceAnnotation = joinPoint.getTarget().getClass().getAnnotation(DataSource.class);
            if(dataSourceAnnotation == null) {
                return;
            }
        }

        /**
         * 获取指定的数据源 value，并将数据源保存到当前线程对应的ThreadLocal中，以便后续使用
         */
        String dataSource = dataSourceAnnotation.value();
        if (!StringUtils.isEmpty(dataSource)) {
            DataSourceHandler.putDataSource(dataSource);
        }
        log.info("动态切换数据源，className: {}, methodName: {}, dataSource: {}", joinPoint.getTarget().getClass().getSimpleName(), method.getName(), dataSource);
    }

    /**
     * 方法执行忘后，清空ThreadLocal，不能影响默认数据源
     * @param joinPoint
     */
    @After(value = "pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        DataSourceHandler.remove();
    }
}

