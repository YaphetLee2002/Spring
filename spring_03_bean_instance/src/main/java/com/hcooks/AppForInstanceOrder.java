package com.hcooks;

import com.hcooks.dao.OrderDao;
import com.hcooks.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
//        早些年使用静态工厂创建对象实现解耦
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDao");
        orderDao.save();
    }
}
