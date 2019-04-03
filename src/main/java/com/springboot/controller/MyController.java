package com.springboot.controller;

import com.springboot.pojo.Student;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
//@SpringBootApplication
public class MyController {
    //@Autowired
    @Resource
    private Student student;
    @RequestMapping("hello")
    @ResponseBody
    public String helloWorld(){
        System.out.println("hello springBoot"+student.getName());

        try {
            //int i =10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello springboot!!!";
    }
}
