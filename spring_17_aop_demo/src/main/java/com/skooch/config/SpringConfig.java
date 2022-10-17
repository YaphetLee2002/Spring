package com.skooch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.skooch")
@PropertySource({"jdbc.properties"})
@EnableAspectJAutoProxy //开启注解式AOP功能
public class SpringConfig {
}
