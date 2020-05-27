package com.zhao.service.impl;

import com.zhao.mapper.UserMapper;
import com.zhao.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public Users tologin(String name, String password) {
        return userMapper.tologin(name, password);
    }
}
