package com.itheima.itcast.ssm.controller.product_controller;

import com.github.pagehelper.PageInfo;
import com.itheima.itcast.ssm.domain.product.Orders;
import com.itheima.itcast.ssm.service.product.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;
//为分页的操作
//    @RequestMapping("/findAll.do")
//    public ModelAndView findAll() throws Exception {
//        ModelAndView mv=new ModelAndView();
//        List<Orders> ordersList = ordersService.findAll();
//        mv.addObject("ordersList",ordersList);
//        mv.setViewName("orders-list");
//        return mv;
//    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1")Integer page,@RequestParam(name="size",required = true,defaultValue = "4")Integer size) throws Exception {

        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page,size);
//        PageInfo是一个分页bean
        PageInfo pageInfo=new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-pages-list");
        return mv;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name ="id",required =true )String orderId) throws Exception {
        //System.out.println(orderId);
        ModelAndView mv=new ModelAndView();
        Orders orders=ordersService.findById(orderId);
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");

        return mv;
    }
}
