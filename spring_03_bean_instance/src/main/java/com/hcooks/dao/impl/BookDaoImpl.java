package com.hcooks.dao.impl;

import com.hcooks.dao.BookDao;

public class BookDaoImpl implements BookDao {
//    Spring创建Bean调用无参构造方法
    private BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    public void save() {
        System.out.println("book dao save...");
    }
}
