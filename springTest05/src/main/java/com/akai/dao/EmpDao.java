package com.akai.dao;

public interface EmpDao {
    int addEmp(int id, String name);
    int updateEmp(int id, String name);
    int removeEmp(int id);
}
