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
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public double transferTo(Account another, double amount) {

        if (amount <= balance) {
            another.balance = another.balance + amount;
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}