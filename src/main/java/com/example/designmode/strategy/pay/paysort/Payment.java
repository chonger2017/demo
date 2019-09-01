package com.example.designmode.strategy.pay.paysort;

import com.example.designmode.strategy.pay.Paystate;

public interface Payment {

    Paystate pay(String uid, double amount);
}
