package com.example.designmode.fatory.Func;

import com.example.designmode.fatory.Mengniu;
import com.example.designmode.fatory.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
