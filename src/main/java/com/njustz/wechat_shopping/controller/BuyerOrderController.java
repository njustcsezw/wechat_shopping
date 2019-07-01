package com.njustz.wechat_shopping.controller;

import com.njustz.wechat_shopping.enums.ResultEnum;
import com.njustz.wechat_shopping.exception.SellException;
import com.njustz.wechat_shopping.form.OrderForm;
import com.njustz.wechat_shopping.viewobject.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author njustz
 * @date 2019/6/24
 */

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    //创建订单
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确，orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        return null;
    }

    //订单列表


    //取消订单


}
