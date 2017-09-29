package com.example.factorymethod;

/**
 * Created by dada on 2017/9/28.
 */

public class AppleFactory implements IPhoneFactory{
    @Override
    public IPhoneProduct createPhone() {
        System.out.println("我生产了苹果手机");
        return new AppleProduct();
    }
}
