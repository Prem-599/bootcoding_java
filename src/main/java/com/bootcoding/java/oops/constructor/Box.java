package com.bootcoding.java.oops.constructor;

public class Box {
    // Properties ,Instance variable or data member
    int length;
    int breath;
    int height;

    public Box() {
        System.out.println("   Default constructor");
    }
    public Box (int l){
        System.out.println("   i am 1st argument constructor");
        length=l;
        print();
    }
    public Box(int l,int b){
        System.out.println("   i am 2nd argument constructor");
        length=l;
        breath=b;
        print();
    }
    public Box(int l,int b,int h){
        System.out.println("   i am 2nd argument constructor");
        length=l;
        breath=b;
        height=h;
        print();
    }
    public void print(){
        System.out.println(length);
        System.out.println(breath);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Box b=new Box();
        Box b2=new Box(5);
        Box b3=new Box(5,6);
        Box b4=new Box(5,6,7);
    }
}

