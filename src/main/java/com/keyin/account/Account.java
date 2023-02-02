package com.keyin.account;

/*
 * Project: QAP1 Problem #1 The Account Class
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class Account {
    // instance variables
    private String id;
    private String name;
    private double balance = 0; // instance variable with default initial value

    // Account constructor that receives two parameters, parametrized constructor
    public Account(String id, String name) {
        // this key word is used to distinguish the instance variable located in the Account class from the parameter sent from the main method
        this.id = id; // this.id is the instance variable and id is the parameter sent from the main method
        this.name = name; // this.name is the instance variable and name is the parameter sent from the main method
    }

    // Account constructor that receives three parameters, parametrized constructor
    public Account(String id, String name, double balance) {
        this.id = id; // this.id is the instance variable and id is the parameter sent from the main method
        this.name = name; // this.name is the instance variable and name is the parameter sent from the main method
        this.balance = balance; // this.balance is the instance variable and balance is the parameter sent from the main method
    }

    // Setters and Getters
    /* Note: no setter for this question
       the return in the getters is the value of the instance variable and not the instance variable itself and
       is passed in from the main method without the return, the getters would return void */

    // the purpose of this method is to return the id of the account
    public String getId() {
        return id;
    }
    // the purpose of this method is to return the name of the account
    public String getName() {
        return name;
    }
    // the purpose of this method is to return the balance of the account
    public double getBalance() {
        return balance;
    }
    // the purpose of this method is to add money to the account
    public double credit(double amount) {
        balance = balance + amount;
        return balance;
    }
    // the purpose of this method is to withdraw money from the account
    public double debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // the purpose of this method is to transfer money from Acc1 to Acc2
    // "another" is a placeholder for Acc2 and "amount" is a placeholder for 1000
    // in this case Account is referencing the class located in Account.java
    public double transferTo(Account another, double amount) {
        /*
        * the reason Acc1 is being used is that the method is in
        * the Account class and Acc1 is an object of the Account class
        * and the method is being called by Acc1 and Acc2 is the parameter
        * of the method and not the object of the Account class
        */
        if (amount <= balance) {
            another.balance = another.balance + amount;
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        // the return in the method is the balance of the account that is sending the money in this case Acc1
        return balance;
    }
    /* the method below is used to print the details of an account a way of combining the getters into one method
       and not putting it in the main method is because it is not the main method's job to compile the details of the account
       but main has a job to print the details of the account */
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}