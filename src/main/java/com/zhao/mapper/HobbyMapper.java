package com.zhao.mapper;

import com.zhao.pojo.Hobby;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

public interface HobbyMapper extends Mapper<Hobby> {
    @Update("update hobby set time=CURRENT_TIMESTAMP,sum=(select count(id) from person where hobby=#{id}) where hobbyname=#{id}")
   public void putHobby(int id);
}
