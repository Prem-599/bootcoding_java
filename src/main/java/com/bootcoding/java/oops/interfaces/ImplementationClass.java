package com.bootcoding.java.oops.interfaces;

public class ImplementationClass implements Car {

    @Override
    public void average() {
        System.out.println("the average of Thar is 14-20 kmpl");
    }

    @Override
    public void speedup() {
        System.out.println("highest speed of Thar is 155km");
    }

    @Override
    public void color() {
        System.out.println("colour of thar is red");
    }

    @Override
    public void model() {
        System.out.println("model name is :- Mahindra Thar 2.5D 5WD (63 HP)");
    }
}
