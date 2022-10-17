package com.skooch;

import com.skooch.config.SpringConfig;
import com.skooch.domain.Account;
import com.skooch.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = applicationContext.getBean(AccountService.class);

        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
