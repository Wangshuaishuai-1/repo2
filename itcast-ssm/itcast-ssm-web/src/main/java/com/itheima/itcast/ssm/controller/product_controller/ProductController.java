package com.itheima.itcast.ssm.controller.product_controller;



import com.github.pagehelper.PageInfo;
import com.itheima.itcast.ssm.domain.product.Product;
import com.itheima.itcast.ssm.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;
    //产品添加
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        iProductService.save(product);
        return "redirect:findAll.do";
    }

    //查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1")Integer page, @RequestParam(name="size",required = true,defaultValue = "4")Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = iProductService.findAll(page,size);
        //        PageInfo是一个分页bean
        PageInfo pageInfo=new PageInfo(ps);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("product-list");
        return mv;

    }
}
