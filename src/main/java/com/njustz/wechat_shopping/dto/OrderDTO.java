package com.njustz.wechat_shopping.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.njustz.wechat_shopping.entity.OrderDetail;
import com.njustz.wechat_shopping.utils.serializer.Date2LongSerializer;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
