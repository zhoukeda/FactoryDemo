package com.example.factorymethod;

/**
 * Created by dada on 2017/9/28.
 */

public class XiaoMiProduct implements IPhoneProduct{
    @Override
    public void salePhone() {
        System.out.println("我销售小米手机");
    }
}
