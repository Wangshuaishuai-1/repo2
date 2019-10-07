package com.itheima.itcast.ssm.service.product;

import com.itheima.itcast.ssm.domain.product.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String orderId)throws Exception;
}
