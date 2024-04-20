package com.akai.service.impl;

import com.akai.dao.UserDao;
import com.akai.pojo.User;
import com.akai.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public int addUser(int id, String name) {
        System.out.println("UserServiceImpl addUser invoked");
        int rows =  userDao.addUser(id, name);
        return 1;
    }
}
