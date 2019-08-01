package com.hadron.hotelmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Hadron
 * @date 2019/8/1 9:32
 */
@Controller
public class HelloController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
