package com.hcooks.service.impl;

import com.hcooks.dao.BookDao;
import com.hcooks.dao.UserDao;
import com.hcooks.dao.impl.BookDaoImpl;
import com.hcooks.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }
}
