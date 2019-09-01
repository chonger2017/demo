package com.example.designmode.singlemode;


/**
 * 优点：没有任何锁的限制，执行效率较高
 * 缺点：类加载的时候就初始化了，无论是否使用，均会占用用空间，耗费内存
 */
public class Hungry {

    //构造方法私有化
    private Hungry(){}
    //先静态，后动态
    //先属性，后方法
    //先上后下
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }
}
