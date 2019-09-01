package com.example.designmode.fatory.Func;

import com.example.designmode.fatory.Milk;
import com.example.designmode.fatory.Sanlu;

public class SanluFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
