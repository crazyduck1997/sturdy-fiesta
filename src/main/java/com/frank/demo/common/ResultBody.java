package com.frank.demo.common;

import com.frank.demo.constant.CommonConstant;
import lombok.Data;

/**
 * @Author frank
 * @date 2022/11/22 22:19
 * @Description
 */
@Data
public class ResultBody<T> {

    private T t;

    private String msg = CommonConstant.RESPONSE_SUCCESS;

    private int code = 200;

    public ResultBody(T t, String msg, int code) {
        this.t = t;
        this.msg = msg;
        this.code = code;
    }

    public ResultBody(T t) {
        this.t = t;
    }

    public ResultBody(T t, String msg) {
        this.t = t;
        this.msg = msg;
    }

    public ResultBody() {
    }


}
