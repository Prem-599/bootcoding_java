package com.bootcoding.java.oops.constructor;

public class Student {
    int age;
    int percentage;
    String branch;

    public Student() {
        System.out.println("default construction");
        print();
    }

    public Student(int a) {
        age = a;
        System.out.println("Print age of student");
        print();
    }

    public Student(int a, int p) {
        age = a;
        percentage = p;
        System.out.println("Print age and percentage of student");
        print();
    }

    public Student(int a, int p, String b) {
        age = a;
        percentage = p;
        branch = "Computer Engineering";
        System.out.println("Print age of student");
        print();
    }
    public void print(){
        System.out.println(age);
        System.out.println(percentage+"%");
        System.out.println(branch);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(23);
        Student s3=new Student(23,78);
        Student s4=new Student(23,78,"Computer Engineering");
    }
}