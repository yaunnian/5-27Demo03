package com.zhao.service.impl;

import com.zhao.mapper.MuenMapper;
import com.zhao.pojo.Muen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuenServiceImpl {
    @Autowired
    private MuenMapper muenMapper;
    public List<Muen> selAll() {
        List<Muen> list=muenMapper.selAll();
        for (Muen muen:list) {
            List<Muen> listChildren=muenMapper.selByPid(muen.getId());
            for (Muen child:listChildren) {
                child.setFilename(child.getFilename());
            }
            muen.setChildren(listChildren);
        }
        return list;
    }
}
