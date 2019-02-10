package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/index")
    public String show(String name){
        return name;
    }

    @RequestMapping(value = "/go/{id}")
    public String haha(@PathVariable int id){
        return "你输入变量是222333：" + id;
    }

}
