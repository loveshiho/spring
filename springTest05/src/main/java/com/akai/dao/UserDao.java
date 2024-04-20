package com.akai.dao;

public interface UserDao {
    int addUser(int id, String name);
    int updateUser(int id, String name);
    int removeUser(int id);
}
