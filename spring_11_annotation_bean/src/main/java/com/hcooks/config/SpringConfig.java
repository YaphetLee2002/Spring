package com.hcooks.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.hcooks.service", "com.hcooks.dao"})
public class SpringConfig {
}
