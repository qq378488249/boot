package com.blue.boot.exception;

/**
 * 运行时异常，spring事务才会回滚
 */
public class GirlRunTimeExcetion extends RuntimeException {
    private Integer code;
    private String msg;

    public GirlRunTimeExcetion(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {

        return code;
    }

    public String getMsg() {
        return msg;
    }
}
