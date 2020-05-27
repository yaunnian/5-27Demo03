package com.zhao.controller;

import com.zhao.pojo.Users;
import com.zhao.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("toLogin")
    public  String toLogin(String name, String password, Model model){
        System.out.println("name"+name +"password"+password);
        Users users = userService.tologin(name, password);
        if (users != null){
            model.addAttribute("users",users.getName());
            return "mainList";
        }
        return "redirect:login";
    }
}
