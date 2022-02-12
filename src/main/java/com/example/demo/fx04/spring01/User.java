package com.example.demo.fx04.spring01;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 14:16
 */
@Data
public class User {
    private String from;
    private Integer age;
    private String name;

    private List<String> friends;
    private Set<String> cities;
    private Map<String,String> session;
    private Integer[] numbers;

}
