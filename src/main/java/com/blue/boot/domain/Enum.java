package com.blue.boot.domain;

public enum Enum {
    OK(200, "OK"),
    SUCCESS(200, "成功"),
    xy18(2, "小于18岁"),
    ksj(3, "空数据");

    private Integer code;
    private String msg;

    Enum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
