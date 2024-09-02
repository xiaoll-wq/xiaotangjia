package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/xiaotangjia")
    public String index() {
        System.out.println("firstController is running!");
        return "xiaotangjia xiaoll doll xyq !";
    }
//    @RequestMapping("/second")
//    public String index() {
//    #    System.out.println("firstController is running!");
//    #    return "Welcome to Spring Boot Application   22222222!";
//    #}
}
