package com.akai.dao.impl;

import com.akai.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int updateUser(int id, String name) {
        return 1;
    }

    @Override
    public int removeUser(int id) {
        return 1;
    }

    @Override
    public int addUser(int id, String name) {
        System.out.println("UserDaoImpl addUser invoked");
        return 1;
    }
}
