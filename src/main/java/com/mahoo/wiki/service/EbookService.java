package com.mahoo.wiki.service;

import com.mahoo.wiki.domain.Ebook;
import com.mahoo.wiki.domain.EbookExample;
import com.mahoo.wiki.mapper.EbookMapper;
import com.mahoo.wiki.request.EbookReq;
import com.mahoo.wiki.response.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(){
        List<Ebook> ebookList = ebookMapper.selectByExample(null);
        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            ebookRespList.add(ebookResp);
        }
        return ebookRespList;
    }

    public List<EbookResp> query(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        // 动态 SQL 查询
        if (!ObjectUtils.isEmpty(ebookReq)){
            criteria.andNameLike("%" + ebookReq.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            ebookRespList.add(ebookResp);
        }
        return ebookRespList;
    }
}
