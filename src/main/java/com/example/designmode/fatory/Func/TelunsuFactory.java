package com.example.designmode.fatory.Func;

import com.example.designmode.fatory.Milk;
import com.example.designmode.fatory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
