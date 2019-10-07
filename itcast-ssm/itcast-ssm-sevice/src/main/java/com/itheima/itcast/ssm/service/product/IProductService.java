package com.itheima.itcast.ssm.service.product;

import com.itheima.itcast.ssm.domain.product.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll(int page, int size) throws Exception;

    void save(Product product) throws Exception;
}
