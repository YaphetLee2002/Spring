package com.hcooks.service.impl;

import com.hcooks.dao.BookDao;
import com.hcooks.dao.impl.BookDaoImpl;
import com.hcooks.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("Set bookDao...");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service init...");
    }
}
