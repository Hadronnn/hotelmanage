package com.hadron.hotelmanage.service;

import com.hadron.hotelmanage.entities.User;

import java.util.List;
import java.util.Map;


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

    /**
     * 查询所有管理员
     * @return
     */
    List<Map<String,Object>> list();
}
