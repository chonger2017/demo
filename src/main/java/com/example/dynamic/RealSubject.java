package com.example.dynamic;

public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String temp) {
        System.out.println("Hello"+temp);
    }
}
