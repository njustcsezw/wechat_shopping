package com.njustz.wechat_shopping.utils;

import com.njustz.wechat_shopping.viewobject.ResultVO;

/**
 * @author njustz
 * @date 2019/5/28
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO reslutVO = new ResultVO();
        reslutVO.setData(object);
        reslutVO.setCode(0);
        reslutVO.setMsg("success");
        return reslutVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){
        ResultVO reslutVO = new ResultVO();
        reslutVO.setCode(code);
        reslutVO.setMsg(msg);
        return reslutVO;
    }

}
