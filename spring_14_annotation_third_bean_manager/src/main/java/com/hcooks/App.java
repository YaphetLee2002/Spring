package com.hcooks;

import com.hcooks.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = (DataSource) annotationConfigApplicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}
