package com.example.lesson13android;

public class Injector {

    public static CounterPresenter attachPresenter(){
        return new CounterPresenter();
    }
}
