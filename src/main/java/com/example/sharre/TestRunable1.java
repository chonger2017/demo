package com.example.sharre;

public class TestRunable1 implements Runnable {
    private TestSync tSync;

    public TestRunable1(TestSync ts){
        this.tSync = ts;
    }

    @Override
    public void run() {
        tSync.test1();
    }
}
