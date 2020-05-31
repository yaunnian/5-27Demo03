package com.zhao.service.impl;

import com.zhao.mapper.PersonMapper;
import com.zhao.pojo.Page;
import com.zhao.pojo.Person;
import com.zhao.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Page queryPerson(Integer rows,Integer page) {
        String arr[]={"读书","音乐","舞蹈","锤人","打游戏","学习","敲代码"};
        List<Person> list = personMapper.queryAll(rows*(page-1),rows);
        for (Person per:list) {
            Long i=per.getHobby();
            int s=i.intValue();
            per.setHobbys(arr[s]);
        }
        Page datagrid=new Page();
        datagrid.setRows(list);
        datagrid.setTotal(personMapper.selCount());
        return datagrid;
    }

    public void insert(Person person) {
        personMapper.insert(person);
    }

    public int delete(String ids) {
        int index=0;
        List<String> list=new ArrayList<>();
        for (String id:ids.split(",")){
            list.add(id);
        }
        for (int i=0;i<list.size();i++) {
            index= personMapper.Querydelete(Integer.parseInt(list.get(i)));
        }
        return index;
    }

    public int updatess(Integer id, String name, String sex, String hobbys, String none) {
        int index=0;
        String arr[]={"读书","音乐","舞蹈","锤人","打游戏","学习","敲代码"};
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(hobbys)){
                 index= personMapper.updatess(id, name, sex, i, none);
            }
        }
        return index;
    }

    public int addses(String name, String sex, String hobbys, String none) {
        int index=0;
        String arr[]={"读书","音乐","舞蹈","锤人","打游戏","学习","敲代码"};
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(hobbys)){
                index=personMapper.addses(name,sex,i,none);
            }
        }
        return index;
    }
}
