package com.njustz.wechat_shopping.dto;

import lombok.Data;

/**
 * 购物车
 * @author njustz
 * @date 2019/6/20
 */

@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
