package com.akai.dao.impl;

import com.akai.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl2 invoked!");
    }
}
