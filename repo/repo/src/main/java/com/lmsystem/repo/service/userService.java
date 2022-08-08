package com.lmsystem.repo.service;

import com.lmsystem.repo.model.User;

public interface userService {
    public String userLogin(User user);

    public String userRegister(User user);

    public void userLogout();
}
