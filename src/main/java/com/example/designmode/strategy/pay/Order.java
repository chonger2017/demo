package com.example.designmode.strategy.pay;

import com.example.designmode.strategy.pay.paysort.PayType;
import com.example.designmode.strategy.pay.paysort.Payment;

public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Paystate pay(PayType payType){
        return payType.get().pay(this.uid,this.amount);
    }
}
