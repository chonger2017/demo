package com.example.designmode.decorator.passport.old;

//@Deprecated
public class SignService implements ISignService {
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
        System.out.println(username + "=" +password + "登陆");
        return null;
    }
}
