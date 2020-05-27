package com.zhao.mapper;

import com.zhao.pojo.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PersonMapper extends Mapper<Person> {
    @Select("select * from person limit #{rows},#{page}")
    List<Person> queryAll(int rows,int page);
    @Select("select count(*) from person")
    int selCount();
    @Update("update  person set name=#{name},sex=#{sex},hobby=#{i},none=#{none} where id=#{id}")
    int updatess(Integer id, String name, String sex, int i, String none);
    @Insert("insert into person(id,name,sex,hobby,createtime,none) values ( null,#{name},#{sex},#{i},CURRENT_TIMESTAMP,#{none} )")
    int addses(String name, String sex, int i, String none);
}
