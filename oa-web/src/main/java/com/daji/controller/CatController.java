package com.daji.controller;

import com.daji.pojo.news_category;
import com.daji.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    CatService service;
    @GetMapping("show")
    public List<news_category> showCat(){
        return  service.gatCat();
    }
}
