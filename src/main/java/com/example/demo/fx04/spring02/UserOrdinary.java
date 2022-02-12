package com.example.demo.fx04.spring02;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 14:47
 */
@Data
@Component("userOrdinary")
public class UserOrdinary {
    private String name = "abc";
    private Integer age = 22;
}
