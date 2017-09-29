package com.example.abstractfactory;

/**
 * Created by dada on 2017/9/29.
 */

public class Factory1 implements IFactory{
    @Override
    public IProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB1();
    }
}
