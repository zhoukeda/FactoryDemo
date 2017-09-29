package com.example.factorymethod;

/**
 * Created by dada on 2017/9/28.
 */

public class HuaWeiFactory implements IPhoneFactory{
    @Override
    public IPhoneProduct createPhone() {
        System.out.println("我生产了华为手机");
        return new HuaWeiProduct();
    }
}
