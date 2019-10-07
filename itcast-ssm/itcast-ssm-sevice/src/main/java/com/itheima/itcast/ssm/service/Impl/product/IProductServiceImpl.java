package com.itheima.itcast.ssm.service.Impl.product;

import com.github.pagehelper.PageHelper;
import com.itheima.itcast.ssm.dao.product.IProductDao;
import com.itheima.itcast.ssm.domain.product.Product;
import com.itheima.itcast.ssm.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll(int page, int size) throws Exception{

        // d调用插件，完成分页，只负责直接相邻下面一行的查询语句
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }
}
