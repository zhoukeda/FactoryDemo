package com.example.factorymethod;

import org.junit.Test;

/**
 *   工厂方法模式，是对简单工厂模式的一种扩展。工厂将不再负责具体产品的创建，专门负责产品的分发
 *   更加解耦，更易于扩展，同时代码量也多一些
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        AllFactory.createFactory(AllFactory.AllFactoryType.Apple).createPhone().salePhone();
        AllFactory.createFactory(AllFactory.AllFactoryType.XiaoMi).createPhone().salePhone();
        AllFactory.createFactory(AllFactory.AllFactoryType.HuaWei).createPhone().salePhone();
    }
}