package com.njustz.wechat_shopping.service.impl;

import com.njustz.wechat_shopping.dto.OrderDTO;
import com.njustz.wechat_shopping.repository.OrderMasterRepository;
import com.njustz.wechat_shopping.service.OrderService;
import com.njustz.wechat_shopping.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author njustz
 * @date 2019/5/30
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private OrderMasterRepository repository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        //查询商品数量，价格

        //计算总价

        //写入订单数据库

        //扣库存

        return null;
    }

    @Override
    public OrderDTO findeOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
