package com.wwb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: WWB
 * @create: 2021-11-09 10:34
 **/
@EnableEurekaClient//声明当前微服务为eureke客户端
@SpringBootApplication
public class PaymentMainApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApplication8001.class,args);
    }
}
