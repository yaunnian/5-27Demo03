package com.zhao.controller;

import com.zhao.pojo.Muen;
import com.zhao.service.impl.MuenServiceImpl;
import com.zhao.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MuenController {
    @Autowired
    private MuenServiceImpl muenService;
    /*
     *查询菜单
     */
    @RequestMapping("showMenu")
    public @ResponseBody List<Muen> showMuen(){
        List<Muen> list=muenService.selAll();
        System.out.println("list"+list);
        return list;
    }
}
