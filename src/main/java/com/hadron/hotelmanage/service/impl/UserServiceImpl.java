package com.hadron.hotelmanage.service.impl;

import com.hadron.hotelmanage.entities.User;
import com.hadron.hotelmanage.exception.LoginException;
import com.hadron.hotelmanage.mappers.UserMapper;
import com.hadron.hotelmanage.service.UserService;
import com.hadron.hotelmanage.util.ExceptionCode;
import com.hadron.hotelmanage.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Hadron
 * @date 2019/8/5 15:17
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public User login(String username, String password) {
        User user = userMapper.queryByUsername(username);
        if (user == null){
            throw new LoginException(ExceptionCode.USERNAME_NOT_EXISTS);
        }
        password = MD5Util.getMd5(username.concat(password));
        user = userMapper.queryByUsernameAndPassword(username, password);
        if (user == null){
            throw new LoginException(ExceptionCode.INVALID_PASSWORD);
        }
        return user;
    }
}
