package com.njustz.wechat_shopping.dto;

import com.njustz.wechat_shopping.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单
 * @author njustz
 * @date 2019/5/30
 */

@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    //买家微信Id
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态 0表示新下单，1表示完结，2表示取消
    private Integer orderStatus;

    //订单付款状态 0表示等待支付，1表示支付成功
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
