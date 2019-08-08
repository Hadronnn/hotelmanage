package com.hadron.hotelmanage.service;

import com.hadron.hotelmanage.entities.Permission;

import java.util.List;

/**
 * @Author Hadron
 * @date 2019/8/6 16:09
 */
public interface ManagerService {
    List<Permission> queryByUserId(Integer userId);
}
