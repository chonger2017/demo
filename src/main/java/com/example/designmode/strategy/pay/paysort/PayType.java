package com.example.designmode.strategy.pay.paysort;

public enum  PayType {
    AL_PAY(new AlPay()),
    WECHAT_PAY(new WeChatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
