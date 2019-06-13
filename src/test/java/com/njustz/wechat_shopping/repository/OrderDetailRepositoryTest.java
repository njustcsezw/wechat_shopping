package com.njustz.wechat_shopping.repository;

import com.njustz.wechat_shopping.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345679");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("123457");
        orderDetail.setProductName("chicken");
        orderDetail.setProductPrice(new BigDecimal(6.00));
        orderDetail.setProductQuantity(2);
        orderDetail.setProductIcon("112.jpg");
        OrderDetail result =  repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId(){
        List<OrderDetail> orderDetailList = repository.findByOrderId("123456");
        System.out.println(orderDetailList);
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}