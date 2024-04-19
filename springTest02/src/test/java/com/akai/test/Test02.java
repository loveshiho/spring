package com.akai.test;

import com.akai.pojo.Cat;
import com.akai.pojo.Mouse;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test02 {
    @Test
    public void testDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Mouse mouse = applicationContext.getBean("mouse", Mouse.class);
        System.out.println(mouse);  // 直接报错
    }
    @Test
    public void testDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Mouse mouse = applicationContext.getBean("mouse", Mouse.class);
        System.out.println(mouse);
        // Mouse{name='Jerry', brithDay=Fri Apr 19 12:33:06 CST 2024}
    }
    @Test
    public void testDI3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Mouse mouse = applicationContext.getBean("mouse", Mouse.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat);
        // Cat{name='Tom', mouse=Mouse{name='Jerry', brithDay=Fri Apr 19 12:37:06 CST 2024}}
    }
    @Test
    public void testDI4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat2 = applicationContext.getBean("cat2", Cat.class);
        System.out.println(cat2);
        // Cat{name='Tom2', mouse=Mouse{name='Jerry2', brithDay=Fri Apr 19 12:45:45 CST 2024}}
    }
}
