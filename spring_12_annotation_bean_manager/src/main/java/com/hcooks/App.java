package com.hcooks;

import com.hcooks.config.SpringConfig;
import com.hcooks.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        applicationContext.registerShutdownHook();
        BookDao bookDao1 = (BookDao) applicationContext.getBean("bookDao");
        BookDao bookDao2 = (BookDao) applicationContext.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}
