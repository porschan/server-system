package com.chanchifeng.serversystem.common.RespModel;

/**
* @author:porschan
* @description:
* @date: Created in 11:46 2018/6/15
* @modified By:
*/
public class RespEntity {
    /**
     * e.g.
     Response Body{
         "success" : true;
         "code" : 200;
         "msg" : "请求成功";
         "data" :[
             {
                 "result" : "123456";
             }
         ]
     }
     */
    private Boolean success;
    private Integer code;
    private String msg;
    private Object data;

    public RespEntity(Boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "RespEntity{" +
                "success=" + success +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
