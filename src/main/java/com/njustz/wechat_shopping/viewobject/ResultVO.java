package com.njustz.wechat_shopping.viewobject;

import lombok.Data;

/**
 * @author njustz
 * @date 2019/5/27
 */
@Data
public class ResultVO<T> {

    //错误码 0表示正常
    private Integer code;

    private String msg;

    private T data;

}
