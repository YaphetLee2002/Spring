package com.hcooks.factory;

import com.hcooks.dao.UserDao;
import com.hcooks.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
