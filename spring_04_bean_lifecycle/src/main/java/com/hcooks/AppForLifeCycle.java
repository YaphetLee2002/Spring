package com.hcooks;

import com.hcooks.dao.BookDao;
import com.hcooks.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
//        使用ClassPathXmlApplicationContext接口来实现close()操作
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注册关闭钩子
        applicationContext.registerShutdownHook();
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        BookService bookDaoService = (BookService) applicationContext.getBean("bookDaoService");
//        bookDao.save();
        bookDaoService.save();
//        //暴力关闭容器
//        applicationContext.close();
    }
}