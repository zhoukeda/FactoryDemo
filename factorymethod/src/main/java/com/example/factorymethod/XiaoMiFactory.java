package com.example.factorymethod;

/**
 * Created by dada on 2017/9/28.
 */

public class XiaoMiFactory implements IPhoneFactory{
    @Override
    public IPhoneProduct createPhone() {
        System.out.println("我生产了小米手机");
        return new XiaoMiProduct();
    }
}
