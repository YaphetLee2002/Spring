package com.skooch.service.impl;

import com.skooch.dao.AccountDao;
import com.skooch.service.AccountService;
import com.skooch.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;


    @Override
    public void transfer(String out,String in ,Double money) {
        try {
            accountDao.outMoney(out,money);
            int i = 1 / 0;
            accountDao.inMoney(in,money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
