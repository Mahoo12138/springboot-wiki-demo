package com.mahoo.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Value("${test.hello}")
    @Value("${test.hello:TEST}")    /* 含默认值 */
    private String testHello;

    @RequestMapping("/test/hello")
    public String testHello(){
        return testHello +" world!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello " + name;
    }
}
