package com.njustz.wechat_shopping.exception;

import com.njustz.wechat_shopping.enums.ResultEnum;

/**
 * @author njustz
 * @date 2019/6/18
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
