package com.example.designmode.ProxyMode.cglib;

public class CGLibTest {


    public static void main(String[] args) {
        try {
            Alice obj = (Alice) new CGLibMeipo().getInstance(Alice.class);
            obj.findLove();
//            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
