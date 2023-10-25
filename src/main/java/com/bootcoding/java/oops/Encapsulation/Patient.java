package com.bootcoding.java.oops.Encapsulation;

import java.util.Date;

public class Patient {
    public String disease;
    public String name;
    public Date dateOfAdmission;
    public Date dischargeDate;
    public void print(){
        System.out.println("Name : "+name);
        System.out.println("Date of Admission : "+dateOfAdmission);
        System.out.println("Date of discharge: " +disease);
    }
}
