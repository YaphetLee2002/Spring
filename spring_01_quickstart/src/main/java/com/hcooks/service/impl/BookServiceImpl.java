package com.hcooks.service.impl;

import com.hcooks.dao.BookDao;
import com.hcooks.dao.impl.BookDaoImpl;
import com.hcooks.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
