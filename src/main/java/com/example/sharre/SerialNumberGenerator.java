package com.example.sharre;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public synchronized static int nextSerialNumber(){
        return serialNumber ++;
    }
}
