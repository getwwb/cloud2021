package com.wwb.springcloud.controller;

import com.wwb.springcloud.entities.CommonResult;
import com.wwb.springcloud.entities.Payment;
import com.wwb.springcloud.server.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Comparator;

/**
 * @author: WWB
 * @create: 2021-11-09 11:44
 **/
@RestController
@Slf4j
public class PaymentController {

//    @Resource
    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    String port;
    //添加
    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("***************插入结果是*****************"+i);
        if (i>0){
            return new CommonResult(200,"插入数据库成功");
        }else {
            return new CommonResult(400,"插入数据库失败");
        }
    }

    //根据id查询
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("**************查询结果："+paymentById);
        if (paymentById!=null){
            return new CommonResult(200,"查询结果成功"+port,paymentById);
        }else {
            return new CommonResult(400,"没有对应记录，查询ID："+id,null);
        }
    }
}
