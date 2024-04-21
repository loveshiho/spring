package com.akai.service.impl;

import com.akai.dao.EmpDao;
import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public int findEmpCount() {
        return empDao.findEmpCount();
    }

    @Override
    public Emp findByEmpNo(int empno) {
        return empDao.findByEmpNo(empno);
    }

    @Override
    public List<Emp> findByDeptNo(int deptno) {
        return empDao.findByDeptNo(deptno);
    }
}
