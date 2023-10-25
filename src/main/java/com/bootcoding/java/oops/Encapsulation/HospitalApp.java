package com.bootcoding.java.oops.Encapsulation;

import java.util.Date;

public class HospitalApp {
    public static void main(String[] args) {
        Patient p=new Patient();
        p.name="saurabh";
        p.dateOfAdmission=new Date();
        p.print();
    }
}
