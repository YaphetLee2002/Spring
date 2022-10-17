package com.hcooks;

import com.hcooks.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = (BookDao) applicationContext.getBean("bookDao");
        BookDao bookDao2 = (BookDao) applicationContext.getBean("bookDao");
//        默认情况是单例的,使用scope属性来切换为非单例
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }

}
