package com.hcooks.dao.impl;

import com.hcooks.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }
    //表示bean初始化对应操作
    public void init() {
        System.out.println("init...");
    }
    //表示bean销毁前对应操作
    public void destroy() {
        System.out.println("destroy...");
    }
}
