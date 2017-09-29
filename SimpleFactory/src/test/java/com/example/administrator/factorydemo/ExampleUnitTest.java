package com.example.administrator.factorydemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *  简单工厂模式：工厂只有一个，产品只有一种类型，有很多个品牌
 */
public class ExampleUnitTest {
    @Test
    public void simpleFactory() throws Exception {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.getPhone(PhoneFactory.PhoneStyle.HuaWei).getIphone();
        phoneFactory.getPhone(PhoneFactory.PhoneStyle.XiaoMi).getIphone();
        phoneFactory.getPhone(PhoneFactory.PhoneStyle.Apple).getIphone();
    }
}