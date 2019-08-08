package com.hadron.hotelmanage.controller;

import com.hadron.hotelmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author Hadron
 * @date 2019/8/8 10:01
 */
@Controller
public class SysController {
    @Autowired
    private UserService userService;

    @RequestMapping("/sys/user")
    public String sysUser(Model model){
        List<Map<String, Object>> list = userService.list();
        model.addAttribute("list",list);
        return "admin-list";
    }
}
