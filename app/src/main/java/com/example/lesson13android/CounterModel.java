package com.example.lesson13android;

public class CounterModel {

    int count = 0;



    void decrement(){
        --count;
    }
    void increment(){
        ++count;
    }
    public int getCount(){
        return count;
    }
}
