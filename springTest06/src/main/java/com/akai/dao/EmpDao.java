package com.akai.dao;

import com.akai.pojo.Emp;

import java.util.List;

public interface EmpDao {
    int findEmpCount();

    Emp findByEmpNo(int empno);

    List<Emp> findByDeptNo(int deptno);
}
