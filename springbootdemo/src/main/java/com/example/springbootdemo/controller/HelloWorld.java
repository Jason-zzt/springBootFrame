package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello this is my first springboot demo";
    }

    @RequestMapping("/hello1")
    public void hello1() {
        System.out.println("aaaa");
    }
}
