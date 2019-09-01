package com.example.designmode.prototype;

import java.util.ArrayList;

public class CloneTest {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.name = "Tom";
        prototype.list = new ArrayList<String>();
        prototype.list.add("1");

        try {
            Prototype obj = (Prototype) prototype.clone();
            System.out.println(obj.list.size());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
