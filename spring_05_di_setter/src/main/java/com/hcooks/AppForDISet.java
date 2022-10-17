package com.hcooks;

import com.hcooks.dao.BookDao;
import com.hcooks.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
    }
}
