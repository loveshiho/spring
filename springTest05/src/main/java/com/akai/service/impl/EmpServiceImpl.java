package com.akai.service.impl;

import com.akai.dao.EmpDao;
import com.akai.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public int addEmp(int id, String name) {
        System.out.println("EmpServiceImpl addEmp invoked");
        empDao.addEmp(id, name);
        return 1;
    }
}
