package com.example.sharre;

public class TestRunable2 implements Runnable {
    private TestSync tSync;

    public TestRunable2(TestSync ts){
        this.tSync = ts;
    }

    @Override
    public void run() {
        tSync.test2();
    }
}
