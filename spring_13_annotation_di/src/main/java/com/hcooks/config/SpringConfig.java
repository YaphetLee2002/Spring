package com.hcooks.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.hcooks.service", "com.hcooks.dao"})
@PropertySource({"jdbc.properties"})
public class SpringConfig {
}
