package com.hcooks.service.impl;

import com.hcooks.dao.BookDao;
import com.hcooks.dao.UserDao;
import com.hcooks.dao.impl.BookDaoImpl;
import com.hcooks.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
