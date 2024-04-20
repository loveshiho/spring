package com.akai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.akai")
@PropertySource("classpath:user.properties")
public class SpringConfig {

}
