package com.akai.dao.impl;

import com.akai.dao.EmpDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Override
    public int addEmp(int id, String name) {
        System.out.println("EmpDaoImpl addEmp invoked");
        return 1;
    }

    @Override
    public int updateEmp(int id, String name) {
        System.out.println("EmpDaoImpl updateEmp invoked");
        return 1;
    }

    @Override
    public int removeEmp(int id) {
        System.out.println("EmpDaoImpl removeEmp invoked");
        return 1;
    }
}
