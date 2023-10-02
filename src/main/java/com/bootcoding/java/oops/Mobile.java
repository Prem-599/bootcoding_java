package com.bootcoding.java.oops;

public class Mobile {
    //properties/ variables
    String model;
    int ram;
    String company;

    public static void main(String[] args) {
        Mobile m = new Mobile();
        // Mobile() - Instruct to create  object of a Class
        // Handover - new - keep it in Heap Memory
        //
        // Heap, Stack and Permgen/MetaSpace (java 8)
        // Stack - Local Variables, Method Parameters
        // Permgen/Metaspace - all static variables, classes, method blocks
        // SCP - String Constant Pool - part of Heap Memory

        m.print();
        m.model = "Iphone 14";
        m.company = "Apple";
        m.ram = 8;
        m.print();
        m.turnOn();
        m.playGame();
        m.calling();
        m.search();
    }
    //why constructor is called constructor ?
     void print(){
         System.out.println("model :- "+model);
         System.out.println("RAM :-  "+ ram);
         System.out.println("company :- "+ company);
     }
     // Behaviours / Methods
     void turnOn(){
         System.out.println("phone is Switch on");
     }
     void calling(){
         System.out.println("Calling others...");
     }
     void playGame(){
         System.out.println("playing a BGMI! ");
     }
     void search(){
         System.out.println("searching for ......");
     }
}
