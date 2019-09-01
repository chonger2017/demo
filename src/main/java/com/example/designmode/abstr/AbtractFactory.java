package com.example.designmode.abstr;

import com.example.designmode.fatory.Milk;

/**
 * 抽象工厂是用户的主入口
 */
public abstract class AbtractFactory {

    /**
     * 获得蒙牛的牛奶
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 获得伊利的牛奶
     * @return
     */
    public abstract Milk getYili();

    /**
     * 获得特仑苏的牛奶
     * @return
     */
    public abstract Milk getTelunsu();

    /**
     * 获得三鹿的牛奶
     * @return
     */
    public abstract Milk getSanlu();
}
