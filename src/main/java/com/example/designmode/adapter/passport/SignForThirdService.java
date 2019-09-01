package com.example.designmode.adapter.passport;

import com.example.designmode.adapter.ResultMap;

public class SignForThirdService extends SignService {

    public ResultMap loginForQQ(String openId) {
        //1.openId是全球唯一，我们可以把他当作一个用户名
        //2.密码默认为QQ_EMPTY
        //3.注册（在原有的系统内创建一个用户）
        //4.调用原来的登陆方法
        return loginForRegist(openId,null);
    }

    public ResultMap loginForWeChat(String openId) {
        return null;
    }

    public ResultMap loginForToken(String openId) {
        return null;
    }

    public ResultMap loginForTelephone(String telephone, String code) {
        return null;
    }

    public ResultMap loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }
}
