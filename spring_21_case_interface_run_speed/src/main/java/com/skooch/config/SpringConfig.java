package com.skooch.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.skooch")
@Import({ MybatisConfig.class, JdbcConfig.class})
@PropertySource({"classpath:jdbc.properties"})
@EnableTransactionManagement
public class SpringConfig {
}
