package com.bootcoding.java.oops.constructor;

public class Marker {
    String company;
    int price;
    String type;
    String color;

    public Marker(){
        System.out.println(" (1)  :- Default construction");
        print();
    }
    public Marker(String s){
        System.out.println(" (2)  :- 1st construction");

        company="power liner";
        print();

    }
    public Marker(String s,int p){
        System.out.println(" (3)  :- 2nd construction");
        company="power liner";
        price=p;
        print();
    }
    public Marker(String s, int p,String t){
        System.out.println(" (4) :- 3rd construction");
        company="power liner";
        price=p;
        type=t;
        print();
    }
    public Marker(String s,int p, String t,String c){
        System.out.println(" (5) :- 4th construction");
        company="power liner";
        price=p;
        type=t;
        color=c;
        print();
    }
    public void print() {
        System.out.println(company);
        System.out.println(price);
        System.out.println(type);
        System.out.println(color);
    }

    public static void main(String[] args) {
        Marker m=new Marker();
        Marker m1=new Marker("power liner");
        Marker m2=new Marker("power liner",40);
        Marker m3=new Marker("power liner",40,"permanent marker","black");
    }
}
