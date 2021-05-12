package com.wochiyao.sharenote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wochiyao.sharenote.bean.User;
import com.wochiyao.sharenote.mapper.UserMapper;
import com.wochiyao.sharenote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUser(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
