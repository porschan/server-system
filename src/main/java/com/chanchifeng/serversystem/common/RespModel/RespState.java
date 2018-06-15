package com.chanchifeng.serversystem.common.RespModel;

/**
* @author:porschan
* @description:
* @date: Created in 11:47 2018/6/15
* @modified By:
*/
public enum RespState {

    STATE_SUCCESS(true,"成功"),STATE_FAIL(false,"失败");

    private Boolean code;
    private String msg;

    RespState(Boolean code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Boolean getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
