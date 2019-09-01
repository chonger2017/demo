package com.example.designmode.adapter;

import com.example.designmode.adapter.passport.SignForThirdService;

public class SignForThirdTest {
    public static void main(String[] args) {
        SignForThirdService service = new SignForThirdService();
        //还可以加一层策略模式
        service.loginForQQ("登陆qq");

    }
}
