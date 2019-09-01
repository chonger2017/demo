package com.example.designmode.decorator.passport;

import com.example.designmode.decorator.passport.old.SignService;
import com.example.designmode.decorator.passport.upgred.ISignForThirdService;
import com.example.designmode.decorator.passport.upgred.SignForThirdService2;

public class SignInTest {
    public static void main(String[] args) {

        //原来的功能依旧对外开放
        //新的功能同样可以使用

        ISignForThirdService signForThirdService = new SignForThirdService2(new SignService());

        signForThirdService.loginForQQ("xxssdsd");

        /**
         * ========================================================================================
         * 装饰器模式                                            适配器模式
         * ----------------------------------------------\-----------------------------------------
         * 是一种非常特别的适配器模式                           可以不保留层级关系
         * ----------------------------------------------\------------------------------------------
         * 装饰者和被装饰着都要实现同一个接口                    适配者和被适配者没有必然的层级联系
         * 主要目的是为了扩展，依旧保留oop关系                   通常采用代理或者继承形式进行包装
         * ----------------------------------------------\------------------------------------------
         * 满足is-a关系                                          满足has-a关系
         * ----------------------------------------------\------------------------------------------
         * 注重的是覆盖和扩展                                    注重的是兼容和转换
         * ----------------------------------------------\------------------------------------------
        */
    }
}
