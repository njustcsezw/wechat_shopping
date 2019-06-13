package com.njustz.wechat_shopping.utils;

import com.njustz.wechat_shopping.viewobject.ReslutVO;

/**
 * @author njustz
 * @date 2019/5/28
 */
public class ResultVOUtil {

    public static ReslutVO success(Object object){
        ReslutVO reslutVO = new ReslutVO();
        reslutVO.setData(object);
        reslutVO.setCode(0);
        reslutVO.setMsg("success");
        return reslutVO;
    }

    public static ReslutVO success(){
        return success(null);
    }

    public static ReslutVO error(Integer code, String msg){
        ReslutVO reslutVO = new ReslutVO();
        reslutVO.setCode(code);
        reslutVO.setMsg(msg);
        return reslutVO;
    }

}
