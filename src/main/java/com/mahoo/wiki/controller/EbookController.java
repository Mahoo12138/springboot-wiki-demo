package com.mahoo.wiki.controller;

import com.mahoo.wiki.domain.Ebook;
import com.mahoo.wiki.resp.CommonResp;
import com.mahoo.wiki.service.EbookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @RequestMapping("/test")
    public CommonResp<List<Ebook>> mybatis(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        resp.setContent(ebookService.list());
        return resp;
    }
}
