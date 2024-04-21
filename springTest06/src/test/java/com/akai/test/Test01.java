package com.akai.test;

import com.akai.pojo.Emp;
import com.akai.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Test01 {
    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    private EmpService empService = context.getBean(EmpService.class);
    @Test
    public void testFindEmpCount() {
        int empCount = empService.findEmpCount();
        System.out.println(empCount);
    }
    @Test
    public void testFindByEmpNo() {
        Emp emp = empService.findByEmpNo(7902);
        System.out.println(emp);
    }
    @Test
    public void testFindBydeptNo() {
        List<Emp> emps = empService.findByDeptNo(20);
        emps.forEach(System.out::println);
    }
    @Test
    public void testAddEmp() {
        empService.addEmp(new Emp(null, "TOM", "SALESMAN", 7521, new Date(), 2000.0, 100.0, 20));
    }
    @Test
    public void testUpdateEmp() {
        empService.updateEmp(new Emp(7939, "JERRY", "MANAGER", 7839, new Date(), 3000.0, 0.0, 20));
    }
    @Test
    public void testDeleteEmp() {
        empService.deleteEmp(7939);
    }
}
