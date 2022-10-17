package com.hcooks.dao.impl;

import com.hcooks.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("order dao save...");
    }
}
