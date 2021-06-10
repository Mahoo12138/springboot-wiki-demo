package com.mahoo.wiki.controller;

import com.mahoo.wiki.domain.Test;
import com.mahoo.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
//    @Value("${test.hello}")
    @Value("${test.hello:TEST}")    /* 含默认值 */
    private String testHello;

    @Resource
    private TestService testService;

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

    @RequestMapping("/test/mybatis")
    public List<Test> mybatis(){
        return testService.list();
    }
}
