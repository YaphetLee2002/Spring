package com.hcooks.impl;

import com.hcooks.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor running...");
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
