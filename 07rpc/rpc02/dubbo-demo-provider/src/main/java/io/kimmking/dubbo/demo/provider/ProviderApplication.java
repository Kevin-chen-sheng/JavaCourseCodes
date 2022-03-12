package io.kimmking.dubbo.demo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月12日 19:11
 */
@SpringBootApplication(scanBasePackages = {"io.kimmking.dubbo.demo.api"})
@MapperScan(basePackages = {"io.kimmking.dubbo.demo.api"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
