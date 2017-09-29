package com.example.administrator.factorydemo;

/**
 * Created by dada on 2017/9/28.
 */

public class PhoneFactory {
    enum PhoneStyle{
        XiaoMi,HuaWei,Apple
    }
    public IPhone getPhone(PhoneStyle phoneStyle) {
        switch (phoneStyle){
            case Apple:
                return new ApplePhone();
            case HuaWei:
                return new HuaWeiPhone();
            case XiaoMi:
                return new XiaoMiPhone();
        }
        return null;
    }
}
