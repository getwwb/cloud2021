package com.wwb.springcloud.server;

import com.wwb.springcloud.entities.Payment;

/**
 * @author: WWB
 * @create: 2021-11-09 11:40
 **/
public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取

}
