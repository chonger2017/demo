package com.example.designmode.ProxyMode.staticted;

import com.example.designmode.ProxyMode.staticted.Father;
import com.example.designmode.ProxyMode.staticted.Son;

public class StaticProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
