package com.example.demo.fx04.spring02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 15:25
 */
@Configuration
public class UserConfig {
    @Bean
    public String message() {
        return "dada";
    }
}
