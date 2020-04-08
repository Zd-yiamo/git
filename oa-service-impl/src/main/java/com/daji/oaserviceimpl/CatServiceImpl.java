package com.daji.oaserviceimpl;

import com.daji.oadao.CatMapper;
import com.daji.pojo.news_category;
import com.daji.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    CatMapper catMapper;
    @Override
    public List<news_category> gatCat() {

        return catMapper.selectAll();
    }
}
