package com.example.designmode.decorator.passport.upgred;

import com.example.designmode.decorator.passport.old.ISignService;
import com.example.designmode.decorator.passport.old.ResultMap;

public interface ISignForThirdService extends ISignService {

    public ResultMap loginForQQ(String openId);

    public ResultMap loginForWeChat(String openId);

    public ResultMap loginForToken(String openId);

    public ResultMap loginForTelephone(String telephone, String code);
    public ResultMap loginForRegist(String username, String password) ;


}
