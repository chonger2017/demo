package com.example.designmode.adapter.passport;

import com.example.designmode.adapter.Member;
import com.example.designmode.adapter.ResultMap;

public class SignService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMap regist(String username, String password) {
        return new ResultMap(200, "注册成功", new Member());
    }

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return
     */
    public ResultMap login(String username, String password) {
        return null;
    }
}
