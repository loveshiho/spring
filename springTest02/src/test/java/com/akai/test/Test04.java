package com.akai.test;

import com.akai.pojo.Book;
import com.akai.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void testDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
    @Test
    public void testDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Book book = applicationContext.getBean("bookFactory", Book.class);  // 注意，这里传入的是Book的全路径名，而不是BookFactory
        System.out.println(book);
    }
}
