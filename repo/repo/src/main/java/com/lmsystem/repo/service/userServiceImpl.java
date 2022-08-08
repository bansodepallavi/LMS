package com.lmsystem.repo.service;

import com.lmsystem.repo.repository.userRepository;
import com.lmsystem.repo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userServiceImpl implements userService{
    @Autowired
    userRepository userdao;
    @Override
    public String userLogin(User user) {
        if(user.username.length() == 0 || user.password.length() < 3 || user.usertype.length() == 0)
            return "enter valid values";
        else if (userdao.existsById(user.username)) {
            User user1=userdao.getById(user.username);
            if(user.password.equals(user1.password))
                return "logged in successfully";
            else
                return "enter valid password";
        }
        else
            return "username or password is invalid";
    }

    @Override
    public String userRegister(User user) {
        if(userdao.existsById(user.username))
            return "user already exists";
        else if(user.username.length() == 0 || user.password.length() < 3 || user.usertype.length() == 0)
            return "enter valid values";
        userdao.save(user);
        return "user registered successfully";
    }

    @Override
    public void userLogout() {

    }
}
