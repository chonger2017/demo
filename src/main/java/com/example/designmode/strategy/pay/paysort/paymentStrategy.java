package com.example.designmode.strategy.pay.paysort;

import com.example.designmode.strategy.pay.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class paymentStrategy {
    public static void main(String[] args) {
        Order order = new Order("1", "20190721151320001", 324);

        //这里
        System.out.println(order.pay(PayType.WECHAT_PAY));

        new ArrayList<Object>().sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });


    }
}
