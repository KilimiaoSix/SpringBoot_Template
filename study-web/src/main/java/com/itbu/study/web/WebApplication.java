package com.itbu.study.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication(scanBasePackages = {"com.itbu.study.*","com.itbu.study.mqtt"})
@MapperScan("com.itbu.study.mapper")
@IntegrationComponentScan(basePackages = "com.itbu.study.mqtt")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
