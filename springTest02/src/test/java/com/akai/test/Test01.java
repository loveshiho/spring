package com.akai.test;

import com.akai.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
    @Test
    public void testGetBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = applicationContext.getBean("user1", User.class);
        System.out.println(user1);
        /*
         * noArgConstructor
         * User{userid=null, username='null', password='null'}
         * */
        User user2 = applicationContext.getBean("user1", User.class);
        System.out.println(user1 == user2);
        /*scope=singleton: true
         * scope=prototype: false
         * 默认值：singleton
         * */
    }
    @Test
    public void testGetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2);
        /*
        * noArgConstructor
        * setUserid
        * User{userid=1, username='cao', password='123456'}
        * */
    }
    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user3 = applicationContext.getBean("user3", User.class);
        System.out.println(user3);
          /*
          noArgConstructor
          setUserid
          setUsername
          setpassword
          allArgConstructor
          User{userid=1, username='cao', password='123456'}
          */
    }
    @Test
    public void testPDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user5 = applicationContext.getBean("user5", User.class);
        System.out.println(user5);
        /*noArgConstructor
          setpassword
          setUserid
          setUsername
          User{userid=4, username='小东', password='111111'}*/
    }
    @Test
    public void testCDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user6 = applicationContext.getBean("user6", User.class);
        System.out.println(user6);
        /*allArgConstructor
        User{userid=222222, username='5', password='小西'}*/
    }
}
