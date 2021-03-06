package com.hadron.hotelmanage;

import com.hadron.hotelmanage.entities.Permission;
import com.hadron.hotelmanage.entities.User;
import com.hadron.hotelmanage.mappers.ManagerMapper;
import com.hadron.hotelmanage.mappers.UserMapper;
import com.hadron.hotelmanage.service.ManagerService;
import com.hadron.hotelmanage.service.UserService;
import com.hadron.hotelmanage.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelmanageApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> list = userService.list();
        for (Map<String, Object> map : list) {
            System.out.println("map = " + map);
        }
    }

}
