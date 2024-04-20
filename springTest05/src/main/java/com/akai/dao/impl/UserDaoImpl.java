package com.akai.dao.impl;

import com.akai.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(int id, String name) {
        System.out.println("UserDaoImpl addUser invoked");
        return 1;
    }
}
