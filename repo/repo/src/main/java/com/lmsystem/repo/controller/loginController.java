package com.lmsystem.repo.controller;

import com.lmsystem.repo.model.User;
import com.lmsystem.repo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired(required = true)
    public userService userservice;

    @PostMapping("/login")
    @ResponseBody
    public String userLogin(@RequestBody User user){
        return this.userservice.userLogin(user);
    }

    @PostMapping("/register")
    @ResponseBody
    public String userRegister(@RequestBody User user){
        return this.userservice.userRegister(user);
    }
}
