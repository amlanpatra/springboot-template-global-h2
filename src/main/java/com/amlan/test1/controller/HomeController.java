package com.amlan.test1.controller;

import com.amlan.test1.entity.User;
import com.amlan.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String homePage(){
//    userService.saveUser(new User(101, "Amlan", "Kolkata"));
//    userService.
//        return userService.getAllUsers().toString();
    return "hello";
    }
}
