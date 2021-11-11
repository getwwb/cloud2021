package com.wwb.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: WWB
 * @create: 2021-11-09 15:34
 **/
@Configuration
//@SpringBootConfiguration
public class ApplicationContextConfig {

   @Bean
   @LoadBalanced  //进行负载均衡轮询服务器  CLOUD-PAYMENT-SERVICE
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
