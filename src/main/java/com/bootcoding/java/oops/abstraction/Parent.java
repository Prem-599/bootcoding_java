package com.bootcoding.java.oops.abstraction;

abstract class Parent {
    double Amount;
    int Quantity;
    public void purchase(double Amount){
        System.out.println(Amount);
    }
    public void purchase(double Amount,int Quantity){
        System.out.println("print amount of product and quantity = "+ Amount + Quantity);
    }
    public void print(){
        System.out.println("You purchasing amount is :"+ Amount);
    }
}
