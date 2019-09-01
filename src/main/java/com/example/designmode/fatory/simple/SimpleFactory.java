package com.example.designmode.fatory.simple;

import com.example.designmode.fatory.Mengniu;
import com.example.designmode.fatory.Milk;
import com.example.designmode.fatory.Telunsu;
import com.example.designmode.fatory.Yili;

public class SimpleFactory {

    public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            return new Telunsu();
        }else if ("伊利".equals(name)){
            return new Yili();
        }else if ("蒙牛".equals(name)){
            return new Mengniu();
        }
        return null;
    }
}
