package com.akai.test;

import com.akai.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void testGetBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        User user = context.getBean("user", User.class);
        System.out.println("第四步:User对象从容器中获取");
        // 关闭容器
        context.close();
        /*第一步:User构造
        第二步:User赋值
        第三步:User初始化
        第四步:User对象从容器中获取
        第五步:User销毁*/
    }
    @Test
    public void testGetBean2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
        User user = context.getBean("user", User.class);
        System.out.println("第四步:User对象从容器中获取");
        // 关闭容器
        context.close();
        /*第一步:User构造
        第二步:User赋值
        Bean初始化之前~
        第三步:User初始化
        Bean初始化之后~
        第四步:User对象从容器中获取
        第五步:User销毁*/
    }
}
