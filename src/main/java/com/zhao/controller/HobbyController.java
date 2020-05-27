package com.zhao.controller;

import com.zhao.service.impl.HobbyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HobbyController {
    @Autowired
    private HobbyServiceImpl hobbyService;
    @Scheduled(fixedRate = 5*1000)
    public void  hobby(){
        hobbyService.putHobby();
        System.out.println(new Date());
    }

}
