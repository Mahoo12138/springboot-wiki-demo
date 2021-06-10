package com.mahoo.wiki.service;

import com.mahoo.wiki.domain.Ebook;
import com.mahoo.wiki.domain.EbookExample;
import com.mahoo.wiki.mapper.EbookMapper;
import com.mahoo.wiki.request.EbookReq;
import com.mahoo.wiki.response.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

    public List<EbookResp> query(EbookReq ebookReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + ebookReq.getName() + "%");
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
