package com.example.designmode.decorator;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

public class DecoratorTest {
    public static void main(String[] args) {

        //为了某个实现类在不修改原始类的基础上进行动态地覆盖或者增加方法
        //该实现保持跟原有类的层级关系
        //采用装饰器模式
        //装饰器模式是一种非常特殊的适配器模式

        //虽然DataInputStream 功能强大
        //DataInputStream 同样要实现InputStream
        InputStream in = null;
        FilterInputStream fis = new DataInputStream(in);

    }
}
