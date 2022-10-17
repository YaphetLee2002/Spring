package com.hcooks.factory;

import com.hcooks.dao.OrderDao;
import com.hcooks.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }
}
