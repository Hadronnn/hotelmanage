package com.hadron.hotelmanage.service;

import com.hadron.hotelmanage.entities.User;


/**
 * @Author Hadron
 * @date 2019/8/5 15:15
 */
public interface UserService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);
}
