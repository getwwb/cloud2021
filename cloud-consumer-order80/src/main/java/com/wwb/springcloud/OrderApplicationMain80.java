package com.wwb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: WWB
 * @create: 2021-11-09 15:31
 **/
@EnableEurekaClient
@SpringBootApplication
public class OrderApplicationMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationMain80.class,args);
    }
}
