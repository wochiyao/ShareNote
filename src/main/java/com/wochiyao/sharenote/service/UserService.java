package com.wochiyao.sharenote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wochiyao.sharenote.bean.User;

public interface UserService extends IService<User> {
    User queryUser(User user);
    int insertUser(User user);
}
