package com.hcooks;

import com.hcooks.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) applicationContext.getBean("service");
        bookService.save();
    }
}
