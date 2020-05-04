package com.jie.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaServer
@EnableTransactionManagement
@EnableEurekaClient
@MapperScan("com.jie.demo.mapper")
public class SpringbootDruidDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDruidDemoApplication.class, args);
    }
}
