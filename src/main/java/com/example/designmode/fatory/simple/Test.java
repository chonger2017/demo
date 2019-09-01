package com.example.designmode.fatory.simple;

import com.example.designmode.fatory.Func.Factory;
import com.example.designmode.fatory.Func.MengniuFactory;
import com.example.designmode.fatory.Telunsu;

public class Test {

    public static void main(String[] args) {

        //这个new 在实际应用场景代码逻辑会更多
//        System.out.println(new Telunsu().getName());

//        SimpleFactory simpleFactory = new SimpleFactory();
//        System.out.println(simpleFactory.getMilk("特仑苏"));

        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk());

    }
}
