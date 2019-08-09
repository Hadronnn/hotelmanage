package com.hadron.hotelmanage.mappers;

import com.hadron.hotelmanage.entities.Permission;
import com.hadron.hotelmanage.entities.Role;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author Hadron
 * @date 2019/8/6 14:41
 */
@Component
public interface ManagerMapper {

    /**
     * 查询用户拥有的一级权限
     * @param userId
     * @return
     */
    List<Permission> query(Integer userId);

    /**
     * 查询二级权限
     * @return
     */
    List<Permission> querych();

    /**
     * 查询所有角色
     * @return
     */
    List<Role> queryAll();
}
