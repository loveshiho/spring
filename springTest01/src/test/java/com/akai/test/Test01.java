package com.akai.test;

import com.akai.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testAddEmp() {
        // 获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = applicationContext.getBean("empDao", EmpDao.class);
        empDao.addEmp();
    }
}
