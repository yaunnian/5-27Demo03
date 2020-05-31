package com.zhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    /*
     *主页面
     */
    @RequestMapping("mainList")
    public String mainList(){
        return "mainList";
    }
}
