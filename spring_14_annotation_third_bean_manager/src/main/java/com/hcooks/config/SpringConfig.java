package com.hcooks.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@Import({JdbcConfig.class})
@PropertySource({"jdbc.properties"})
public class SpringConfig {

}
