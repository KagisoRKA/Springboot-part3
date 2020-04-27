package com.springboot.part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @Autowired
    static UserServiceImpl userService;
    @GetMapping("/controller")
    public void controller() {
        System.out.println(userService.addUser(2, "Johnny", "Walker"));
        System.out.println(userService.removeUser(2));
    }
}