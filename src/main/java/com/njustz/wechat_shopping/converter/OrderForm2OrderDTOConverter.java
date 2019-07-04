package com.njustz.wechat_shopping.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.njustz.wechat_shopping.dto.OrderDTO;
import com.njustz.wechat_shopping.entity.OrderDetail;
import com.njustz.wechat_shopping.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njustz
 * @date 2019/7/1
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try{
            orderDetailList = gson.fromJson(orderForm.getItems(),
                new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【对象转换】错误，string={}", orderForm.getItems());
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
