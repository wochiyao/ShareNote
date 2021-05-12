package com.wochiyao.sharenote.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wochiyao.sharenote.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where name=#{name} and password=#{password}")
    User queryUser(User user);

    @Insert("insert into user(id,name,password) values(#{id},#{name},#{password})")
    int insertUser(User user);
}
