package com.example.demo.db05.jdbc.ds.ano;

import java.lang.annotation.*;

@Target(value = {ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    /**
     * 数据源名称
     * @return
     */
    String value() default "master";
}

