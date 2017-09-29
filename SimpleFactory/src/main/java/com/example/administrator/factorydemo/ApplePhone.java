package com.example.administrator.factorydemo;

import android.util.Log;

/**
 * Created by dada on 2017/9/28.
 */

public class ApplePhone implements IPhone{
    @Override
    public void getIphone() {
        System.out.println("购买苹果手机");
    }
}
