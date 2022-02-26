package com.example.demo.db05.jdbc.ds;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月25日 17:03
 */
@Aspect
@Order(1)
@Component
public class DataSourceAspect {
    @Before(value = "execution(* com.netease.nsip.DynamicDataSource.dao..*.insert*(..))"
            + "||execution(* com.netease.nsip.DynamicDataSource.dao..*.add*(..))"
            + "||@org.springframework.transaction.annotation.Transactional * *(..)")
    public Object before(ProceedingJoinPoint joinPoint) throws Throwable {
        DatabaseContextHolder.setCustomerType("master");
        Object object = joinPoint.proceed();
        DatabaseContextHolder.setCustomerType("slave");
        return object;
    }
}
