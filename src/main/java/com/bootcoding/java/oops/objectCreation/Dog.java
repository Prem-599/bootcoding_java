package com.bootcoding.java.oops.objectCreation;

public class Dog {
    String name;
    static String breed;
    String color;
    public static void main(String[] args) {
        Dog d =new Dog();
        d.name=" DUGGU ";
        d.color="off white";
        Dog.breed="Labrador";
        System.out.println("Name :"+d.name);
        System.out.println("Color :"+d.color);
        System.out.println("BREED "+Dog.breed);
        Dog.eat();
        Dog d1=new Dog();
        d1.run();
        Dog.lazy();
    }
    public static void eat() {
        System.out.println("duugu's favourite food is pedigree");
    }
    public static void run(){
        System.out.println(" duggu run very fast");
    }
    public static void lazy(){
        System.out.println("duggu is very lazy ");
    }

}
