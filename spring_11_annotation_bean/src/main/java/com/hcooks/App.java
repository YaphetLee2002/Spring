package com.hcooks;

import com.hcooks.dao.BookDao;
import com.hcooks.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookDao);
        System.out.println(bookService);
    }
}
