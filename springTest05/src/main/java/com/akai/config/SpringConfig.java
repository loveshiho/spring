package com.akai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.akai")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
