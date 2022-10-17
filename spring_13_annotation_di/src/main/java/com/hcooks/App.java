package com.hcooks;

import com.hcooks.config.SpringConfig;
import com.hcooks.dao.BookDao;
import com.hcooks.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.save();
    }
}
