package com.hcooks.service.impl;

import com.hcooks.dao.BookDao;
import com.hcooks.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
