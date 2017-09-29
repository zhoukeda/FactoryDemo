package com.example.abstractfactory;

import java.util.Calendar;

/**
 * Created by dada on 2017/9/29.
 */

public class AbstractFactory{
    enum F{
        F1,F2
    }
    public IFactory getF(F f){
        switch (f){
            case F1:
                return new Factory1();
            case F2:
                return new Factory2();
        }
        return null;
    }
}
