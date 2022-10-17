package com.hcooks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.print.Book;

public class App {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从文件系统下加载配置文件
//        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("C:\\Codefield\\CODE_SPRING\\spring_10_container\\src\\main\\resources\\applicationContext.xml");

//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
//        BookDao bookDao = applicationContext.getBean(BookDao.class);
//        bookDao.save();
    }
}
