package com.akai.service.impl;

import com.akai.dao.AccountDao;
import com.akai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
// @Transactional // 加在类上,代表类中的所有方法都添加了事务控制
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Transactional  // 放在方法上,就是仅仅对当前方法添加了事务控制
    @Override
    public int transMoney(int from, int to, int money) {
        int rows = 0;
        rows += accountDao.transMoney(from, 0 - money);
//        int i  = 1 / 0;
        rows += accountDao.transMoney(to, money);
        return rows;
    }
}
