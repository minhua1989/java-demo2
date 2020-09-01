package com.shentie.javademo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: TestController
 * @Author huamin
 * @Date: 2020/9/1 11:10
 * @Version 1.0
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello world";
    }
}