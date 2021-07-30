package com.mahoo.wiki.controller;

import com.mahoo.wiki.domain.Ebook;
import com.mahoo.wiki.request.EbookReq;
import com.mahoo.wiki.response.CommonResp;
import com.mahoo.wiki.response.EbookResp;
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

    @RequestMapping("/list")
    public CommonResp<List<Ebook>> list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        resp.setContent(ebookService.list());
        return resp;
    }

//    @RequestMapping("/query")
//    public CommonResp<List<Ebook>> result(String name){
//        CommonResp<List<Ebook>> resp = new CommonResp<>();
//        resp.setContent(ebookService.query(name));
//        return resp;
//    }

    @RequestMapping("/query")
    public CommonResp<List<EbookResp>> result(EbookReq ebookReq){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        resp.setContent(ebookService.query(ebookReq));
        return resp;
    }
}
