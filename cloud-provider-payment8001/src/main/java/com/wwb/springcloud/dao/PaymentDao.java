package com.wwb.springcloud.dao;

import com.wwb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author: WWB
 * @create: 2021-11-09 11:36
 **/
@Component       //代替@Repository声明bean
@Mapper               //mybatis提供的，等价：@MapperScan("com.wwb.springcloud.dao")
//@Repository     //spring提供的。在此，只是为了声明bean对象
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
