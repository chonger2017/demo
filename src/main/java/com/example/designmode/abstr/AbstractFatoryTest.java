package com.example.designmode.abstr;

public class AbstractFatoryTest {

    public static void main(String[] args) {

        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMengniu());
    }
}
