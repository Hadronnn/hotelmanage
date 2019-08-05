package com.hadron.hotelmanage.mappers;

import com.hadron.hotelmanage.entities.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Hadron
 * @date 2019/8/5 14:42
 */
@Component
public interface UserMapper {
    /**
     * 通过用户名查询
     * @param username
     * @return
     */
    User queryByUsername(String username);

    /**
     * 通过用户名和密码查询
     * @param username
     * @param password
     * @return
     */
    User queryByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

    /**
     * 查询全部
     * @return
     */
    List<User> queryAll();
}
