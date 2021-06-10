package com.mahoo.wiki.controller;

import com.mahoo.wiki.domain.Demo;
import com.mahoo.wiki.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/test/demo")
    public List<Demo> mybatis(){
        return demoService.list();
    }
}
