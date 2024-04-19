package com.akai.test;

import com.akai.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @Test
    public void testDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Student student1 = applicationContext.getBean("student1", Student.class);
        System.out.println(student1);
    }
}
