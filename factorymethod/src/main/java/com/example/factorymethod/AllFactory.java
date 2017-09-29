package com.example.factorymethod;

/**
 * Created by dada on 2017/9/28.
 */

public class AllFactory {


    enum AllFactoryType {
        XiaoMi, HuaWei, Apple
    }

    public static IPhoneFactory createFactory(AllFactoryType type){
        switch (type){
            case XiaoMi:
                return new XiaoMiFactory();
            case HuaWei:
                return new HuaWeiFactory();
            case Apple:
                return new AppleFactory();
        }
        return null;
    }
}
