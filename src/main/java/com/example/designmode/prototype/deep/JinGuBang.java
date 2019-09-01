package com.example.designmode.prototype.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    public float h;
    public float d;

    public void big(){
        this.d *= 2;
        this.h *=2;
    }

    public void small(){
        this.d /=2;
        this.h /=2;
    }
}
