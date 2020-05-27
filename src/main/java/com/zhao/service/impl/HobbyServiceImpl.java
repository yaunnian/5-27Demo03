package com.zhao.service.impl;

import com.zhao.mapper.HobbyMapper;
import com.zhao.pojo.Hobby;
import com.zhao.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyServiceImpl implements HobbyService {
    @Autowired
    private HobbyMapper hobbyMapper;
    public List<Hobby> queryAll() {
        List<Hobby> list = hobbyMapper.selectAll();
        return list;
    }

    public void putHobby() {
        for (int i=0;i<=6;i++) {
            hobbyMapper.putHobby(i);
        }
    }
}
