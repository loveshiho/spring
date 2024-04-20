package com.akai.test;

import com.akai.config.SpringConfig;
import com.akai.dao.EmpDao;
import com.akai.dao.UserDao;
import com.akai.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        userService.addUser(1, "cao");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao.getClass().getName());   // jdk.proxy2.$Proxy17
    }
    @Test
    public void testGetUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        userDao.addUser(1, "cao");  // [1, cao]
    }
    @Test
    public void testGetEmp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpDao empDao = context.getBean(EmpDao.class);
        empDao.addEmp(1, "akai");
    }
    @Test
    public void testGetEmp2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmpDao empDao = context.getBean(EmpDao.class);
        empDao.addEmp(1, "akai");
    }
}
