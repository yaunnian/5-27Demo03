package com.zhao.mapper;

import com.zhao.pojo.Muen;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MuenMapper extends Mapper<Muen> {
    @Select("select * from muen where pid=0" )
    List<Muen> selAll();
    @Select("select * from muen where pid=#{pid}")
    List<Muen> selByPid(int pid);

}
