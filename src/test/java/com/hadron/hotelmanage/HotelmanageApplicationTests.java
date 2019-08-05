package com.hadron.hotelmanage;

import com.hadron.hotelmanage.entities.User;
import com.hadron.hotelmanage.mappers.UserMapper;
import com.hadron.hotelmanage.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelmanageApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        /*String str = "superadmin123456";
        String md5 = MD5Util.getMd5(str);
        System.out.println("md5 = " + md5);*/
        /*List<User> users = userMapper.queryAll();
        System.out.println("users = " + users);*/
        /*User admin = userMapper.queryByUsername("admin");
        System.out.println("admin = " + admin);*/
        User superadmin = userMapper.queryByUsernameAndPassword("superadmin", "90bbb23d2b633ac4b95bcee603286e67");
        System.out.println("superadmin = " + superadmin);
    }

}
