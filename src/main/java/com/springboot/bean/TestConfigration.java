package com.springboot.bean;

import com.springboot.pojo.Student;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootConfiguration
public class TestConfigration {
    @Bean
    public Student createStu(){
     Student s = new Student();
     s.setName("小明");
     return s;
    }

}
