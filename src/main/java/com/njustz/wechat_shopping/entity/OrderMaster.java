package com.njustz.wechat_shopping.entity;

import com.njustz.wechat_shopping.enums.OrderStatusEnum;
import com.njustz.wechat_shopping.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author njustz
 * @date 2019/5/28
 */

@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    //买家微信Id
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态 0表示新下单，1表示完结，2表示取消
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //订单付款状态 0表示等待支付，1表示支付成功
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

}
