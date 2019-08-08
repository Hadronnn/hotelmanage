package com.hadron.hotelmanage.controller;

import com.hadron.hotelmanage.entities.Permission;
import com.hadron.hotelmanage.entities.User;
import com.hadron.hotelmanage.service.ManagerService;
import com.hadron.hotelmanage.service.UserService;
import com.hadron.hotelmanage.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author Hadron
 * @date 2019/8/5 10:59
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ManagerService managerService;
    @RequestMapping("/login")
    public String login(HttpSession session){
        session.invalidate();
        return "login";
    }
    @PostMapping(value = "dologin",produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result doLogin(String username, String password, HttpSession session){
        User user = userService.login(username, password);
        Integer userId = user.getUserId();
        System.out.println("userId = " + userId);
        List<Permission> list = managerService.queryByUserId(userId);
        session.setAttribute("user",user);
        session.setAttribute("list",list);
        System.out.println("list = " + list);
        return new Result("登陆成功",true);
    }
}
