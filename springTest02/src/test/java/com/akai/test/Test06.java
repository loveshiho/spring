package com.akai.test;

import com.akai.pojo.Emp;
import com.akai.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
    @Test
    public void testAutoWired() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
