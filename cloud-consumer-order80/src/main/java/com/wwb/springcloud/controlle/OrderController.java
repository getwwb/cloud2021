package com.wwb.springcloud.controlle;

import com.wwb.springcloud.entities.CommonResult;
import com.wwb.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: WWB
 * @create: 2021-11-09 15:38
 **/
@RestController
@Slf4j
public class OrderController {
//    public static final String PATH = "http://localhost:8001";
   public static final String PATH = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;



    //添加功能
    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        CommonResult commonResult = restTemplate.postForObject(PATH + "/payment/create", payment, CommonResult.class);
        return commonResult; //写操作
    }

    //根据id查询
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment>  getPaymentById(@PathVariable("id") Long id){
        CommonResult forObject = restTemplate.getForObject(PATH + "/payment/get/" + id, CommonResult.class);
        return forObject;
    }
}
