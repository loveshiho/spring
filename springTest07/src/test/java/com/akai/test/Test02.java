package com.akai.test;

import com.akai.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig.xml")    // 读取配置文件
public class Test02 {
    @Autowired
    private AccountService accountService;
    @Test
    public void testTransMoney() {
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
}
