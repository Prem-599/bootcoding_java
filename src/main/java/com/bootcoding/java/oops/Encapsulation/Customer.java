package com.bootcoding.java.oops.Encapsulation;

public class Customer {
    private int pin;
    public String name;
    private double balance;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  getBalance(int pin ) {
        if (pin==5656){
            System.out.println("print account balance ="+ 5000);
        }
        else {
            System.out.println("pin is invalid ");
        }
         this.balance=balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void print() {
        System.out.println("customer name = " + name);
    }


}
