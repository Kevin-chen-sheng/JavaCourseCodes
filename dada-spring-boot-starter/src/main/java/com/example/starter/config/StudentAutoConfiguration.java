package com.example.starter.config;

import com.example.starter.beans.Student;
import com.example.starter.service.DaDaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 17:51
 */
@Configuration
@EnableConfigurationProperties(Student.class)
//@ConditionalOnProperty(
//        prefix = "dastudent",
//        name = "isopen",
//        havingValue = "false"
//)
public class StudentAutoConfiguration {
    @Autowired
    private Student student;

    @Bean(name = "dastudent")
    public DaDaService demoService(){
        return new DaDaService(student.getId(), student.getName(),student.getBeanName());
    }
}
