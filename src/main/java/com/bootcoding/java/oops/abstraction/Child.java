package com.bootcoding.java.oops.abstraction;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child=new Child();
        child.purchase(23.20);
        child.purchase(56,87);
        child.print();
    }
}
