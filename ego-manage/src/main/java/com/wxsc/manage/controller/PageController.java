package com.wxsc.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhongbo on 2018/10/11.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String welcome(){
        System.out.println("1111111111");
        return "index";
    }
    @RequestMapping("{page}")
    public String showPage(@PathVariable String page){
        System.out.println("2222222222222");
        return page;
    }
}
