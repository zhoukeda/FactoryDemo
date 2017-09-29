package com.example.abstractfactory;

/**
 * Created by dada on 2017/9/29.
 */

public class Factory2 implements IFactory{
    @Override
    public IProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB2();
    }
}

