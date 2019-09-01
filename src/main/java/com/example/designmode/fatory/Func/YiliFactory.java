package com.example.designmode.fatory.Func;

import com.example.designmode.fatory.Milk;
import com.example.designmode.fatory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
