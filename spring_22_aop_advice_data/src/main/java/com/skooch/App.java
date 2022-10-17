package com.skooch;

import com.skooch.config.SpringConfig;
import com.skooch.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        String name = bookDao.findName(100, "skooch");
        System.out.println(name);
    }
}
