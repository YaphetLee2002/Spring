package com.skooch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.skooch")
@Import({ MybatisConfig.class, JdbcConfig.class})
@PropertySource({"jdbc.properties"})
public class SpringConfig {

}
