package com.akai.test;

import com.akai.pojo.Account;
import com.akai.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testTransMoney() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        AccountService accountService = context.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
}
