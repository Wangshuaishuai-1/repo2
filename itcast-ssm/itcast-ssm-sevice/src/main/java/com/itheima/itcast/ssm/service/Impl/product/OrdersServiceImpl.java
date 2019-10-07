package com.itheima.itcast.ssm.service.Impl.product;


import com.github.pagehelper.PageHelper;
import com.itheima.itcast.ssm.dao.product.IOrdersDao;
import com.itheima.itcast.ssm.domain.product.Orders;
import com.itheima.itcast.ssm.service.product.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception{
//        d调用插件，完成分页，只负责直接相邻下面一行的查询语句
        PageHelper.startPage(page,size);
//        返回查询数据
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String orderId) throws Exception {
        return ordersDao.findById(orderId);
    }
}
