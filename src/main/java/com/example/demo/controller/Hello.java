package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//向外提供接口
@RequestMapping
public class Hello {

    @GetMapping("/hello")//对外提供get请求,路径是/hello
    public String hello(){
        return"Hello";
    }

}
