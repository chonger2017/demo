package com.example.designmode.ProxyMode.jdk;

import com.example.designmode.ProxyMode.staticted.Person;

public class Daniel implements Person {

    public void findLove(){
        System.out.println("fair skin and slender legs");
        System.out.println("high 168 cm");
        System.out.println("胸大, 马甲线");
    }

    @Override
    public void rent() {
        System.out.println("找个一室一厅的房子");
    }

    @Override
    public void buy() {
        System.out.println("买一个130平米的大房子");
    }

    @Override
    public void findjob() {
        System.out.println("找一个月薪上20k的工作");
    }

}
