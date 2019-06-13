package com.njustz.wechat_shopping.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author njustz
 * @date 2019/5/26
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    //商品价格，8+2
    private BigDecimal productPrice;

    //商品库存
    private Integer productStock;

    //描述，可为空
    private String productDescription;

    //小图，链接，可为空
    private String productIcon;

    //商品状态，0正差1下架，默认0
    private Integer productStatus = 0;

    private Integer categoryType;


}
