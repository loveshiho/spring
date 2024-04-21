package com.akai.service;

import com.akai.pojo.Emp;

import java.util.List;

public interface EmpService {
    // 查询员工个数
    int findEmpCount();
    Emp findByEmpNo(int empno);
    List<Emp> findByDeptNo(int deptno);
}
