package com.example.designmode.prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable {

    public String name;

    public ArrayList<String> list;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
