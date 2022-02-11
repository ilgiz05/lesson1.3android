package com.example.lesson13android;

public class CounterContracts {

    int teen = 10;

    interface CounterView{
        void updateCounter(int count);
        void ten();
        void greenView();
    }

    interface Presenter{
        void increment();
        void attachView(CounterView counterView);
        void change();

    }
}
