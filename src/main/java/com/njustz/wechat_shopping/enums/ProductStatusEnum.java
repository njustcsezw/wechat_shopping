package com.njustz.wechat_shopping.enums;

import lombok.Getter;

/**
 * @author njustz
 * @date 2019/5/28
 */

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
