package com.mahoo.wiki.service;

import com.mahoo.wiki.entity.Test;
import com.mahoo.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 逻辑一般写在 service 层
// 添加注解，让 Spring 管理这个类
@Service
public class TestService {
    // 添加注解，注入类，还可以使用 @AutoWired
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }

}
