package com.example.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        new AbstractFactory().getF(AbstractFactory.F.F1).getProductA().getProductAShow();
        new AbstractFactory().getF(AbstractFactory.F.F1).getProductB().getProductBShow();
        new AbstractFactory().getF(AbstractFactory.F.F2).getProductA().getProductAShow();
        new AbstractFactory().getF(AbstractFactory.F.F2).getProductB().getProductBShow();
    }
}