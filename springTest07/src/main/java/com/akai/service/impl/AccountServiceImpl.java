package com.akai.service.impl;

import com.akai.dao.AccountDao;
import com.akai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public int transMoney(int from, int to, int money) {
        int rows = 0;
        rows += accountDao.transMoney(from, 0 - money);
        rows += accountDao.transMoney(to, money);
        return rows;
    }
}
