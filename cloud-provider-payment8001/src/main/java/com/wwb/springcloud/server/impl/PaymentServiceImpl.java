package com.wwb.springcloud.server.impl;

import com.wwb.springcloud.dao.PaymentDao;
import com.wwb.springcloud.entities.Payment;
import com.wwb.springcloud.server.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: WWB
 * @create: 2021-11-09 11:41
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    //@Resource
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
