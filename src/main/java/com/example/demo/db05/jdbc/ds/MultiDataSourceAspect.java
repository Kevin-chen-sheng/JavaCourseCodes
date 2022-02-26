package com.example.demo.db05.jdbc.ds;

import com.example.demo.db05.jdbc.ds.ano.Profile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月25日 20:18
 */
public class MultiDataSourceAspect {
    public void before(JoinPoint joinPoint) throws Throwable {
        Object target = joinPoint.getTarget();
        String method = joinPoint.getSignature().getName();
        Class<?>[] classz = target.getClass().getInterfaces();

        Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature()).
                getMethod().getParameterTypes();
        try {
            Method m = classz[0].getMethod(method, parameterTypes);
            if (m != null&&m.isAnnotationPresent(Profile.class)) {
                Profile data = m  .getAnnotation(Profile.class);
                DatabaseContextHolder.setCustomerType(data.value());
            }
        } catch (Exception e) {
        }
    }
}
