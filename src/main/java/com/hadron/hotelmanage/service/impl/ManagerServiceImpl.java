package com.hadron.hotelmanage.service.impl;

import com.hadron.hotelmanage.entities.Permission;
import com.hadron.hotelmanage.mappers.ManagerMapper;
import com.hadron.hotelmanage.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Hadron
 * @date 2019/8/6 16:09
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public List<Permission> queryByUserId(Integer userId) {
        List<Permission> list = managerMapper.query(userId );

        List<Permission> list1 = managerMapper.querych();
        for (Permission permission : list) {
            List <Permission> permissions = new ArrayList<>();
            for (Permission permission1 : list1) {
//                System.out.println("permission1 = " + permission1);
                if (permission.getPermissionId().equals(permission1.getParentId()) ){
                    permissions.add(permission1);
                }
            }
//            System.out.println("permissions = " + permissions);
            permission.setPermissions(permissions);
        }
        return list;
    }
}
