package com.example.designmode.decorator.passport.old;

public interface ISignService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMap regist(String username, String password);

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return
     */
    public ResultMap login(String username, String password);
}
