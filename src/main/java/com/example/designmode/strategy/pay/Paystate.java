package com.example.designmode.strategy.pay;

public class Paystate {
    private int code;
    private Object data;
    private String msg;

    public Paystate(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return "支付状态:[" +code+"]," + msg + ",支付详情" + data;
    }
}
