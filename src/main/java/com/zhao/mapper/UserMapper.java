package com.zhao.mapper;

import com.zhao.pojo.Users;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<Users> {
    @Select("select * from users where name=#{name} and password=#{password}")
    Users tologin(String name, String password);
}
