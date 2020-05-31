package com.zhao.controller;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.zhao.pojo.Hobby;
import com.zhao.pojo.Page;
import com.zhao.pojo.Person;
import com.zhao.service.impl.HobbyServiceImpl;
import com.zhao.service.impl.PersonServiceImpl;
import com.zhao.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;
    @Autowired
    private HobbyServiceImpl hobbyService;
    /*
    *修改窗口
    */
    @RequestMapping("person/update")
    public String update(){
        return "update";
    }
    /*
     *新增窗口
     */
    @RequestMapping("person/add")
    public String add(){
        return "add";
    }
    /*
     *报表
     */
    @RequestMapping("/main")
    public String main(Model model){
        return "main";
    }
    /*
     *用户窗口
     */
    @RequestMapping("person")
    public String person(){
        return "person";
    }

   /* @RequestMapping("addperson")
    public String addperson(){
        return "addperson";
    }*/

    @RequestMapping("data")
    public @ResponseBody String data(Model model){
        List<Hobby> list=hobbyService.queryAll();
        String json = JsonUtil.list2json(list);
        System.out.println("list"+json);
        return json;
    }/*
     *用户数据
     */
    @RequestMapping("queryPerson")
    public @ResponseBody Page queryPerson(@RequestParam(defaultValue = "5")Integer rows, @RequestParam(defaultValue = "1")Integer page ){
        Page list=personService.queryPerson(rows,page);
        return list;
    }
   /* @RequestMapping("insert")
    public String insert(String name,String sex,Long hobby,String none){
        personService.insert(new Person(name,sex,hobby,new Date(),none));
        return "redirect:person";
    }*/
    @RequestMapping("deletese")
    public @ResponseBody int delete(String id){
        System.out.println("id"+id);
        if (id != null) {
            int i = personService.delete(id);
            if (i >0){
                return 1;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }

   /*
    *用户更新i
    */
    @RequestMapping("updatess")
    public @ResponseBody int updatess(Integer id,String name,String sex,String hobbys,String none) {
        System.out.println("修改参数" + id + name + sex + hobbys + none);
        int i = personService.updatess(id, name, sex, hobbys, none);
        if (i>0) {
            return 1;
        }else {
            return 0;
        }
    }
    /*
     *用户新增
     */
    @RequestMapping("insertese")
    public @ResponseBody int add(String name, String sex, String hobbys, String none){
        System.out.println("新增参数"+name + sex + hobbys + none);
        int i=personService.addses(name,sex,hobbys,none);
        if (i>0) {
            return 1;
        }else {
            return 0;
        }
    }
}
