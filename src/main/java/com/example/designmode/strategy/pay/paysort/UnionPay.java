package com.example.designmode.strategy.pay.paysort;

import com.example.designmode.strategy.pay.Paystate;

public class UnionPay implements Payment {
    @Override
    public Paystate pay(String uid, double amount) {
        System.out.println("欢迎使用银联支付");
        System.out.println("查询账户余额，开始扣款");
        return new Paystate(200, amount,"支付成功");
    }
}
