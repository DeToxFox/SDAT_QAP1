package com.keyin.account;

/*
 * Project: QAP1 Problem #1 The Account Class
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class TestAccount {
    public static void main(String[] args) {
        // Create two Account objects
        Account Acc1 = new Account("1", "Account 1", 5000);
        Account Acc2 = new Account("2", "Account 2", 4000);

        // Display of balances using format specifier
        System.out.printf("\nOriginal Balance of Account 1: $%,d%n", Acc1.getBalance());
        System.out.printf("Original Balance of Account 2: $%,d%n\n", Acc2.getBalance());

        // Transfer of $1000 from Account 1 to Account 2 using credit and debit methods vs transferTo method
        Acc2.credit(1000);
        Acc1.debit(1000);
        System.out.printf("Balance of Account 1 after using credit and debit methods: $%,d%n", Acc1.getBalance());
        System.out.printf("Balance of Account 2 after using credit and debit methods: $%,d%n\n", Acc2.getBalance());
        // Reset the balances of both accounts
        Acc1.credit(1000);
        Acc2.debit(1000);


        // Transfer of $1000 from Account 1 to Account 2
        // this method call transfers money from one account to another by using the transferTo method in Account.java, Acc1 is an object of the Account class in this Acc1 is sending money to another object of the Account class which is Acc2.
        Acc1.transferTo(Acc2, 1000);
        // System.out.println(Acc1.transferTo(Acc2, 1000));

        /*
         * Display the balance of both accounts using the getBalance() method and
         * all account details (toString() method) making sure the balances have formating using
         * the format specifier
         */
        // Account 1
        System.out.println(Acc1);
        System.out.printf("Balance of Account 1 after using transferTo method: $%,d%n\n", Acc1.getBalance());
        // Account 2
        System.out.println(Acc2);
        System.out.printf("Balance of Account 2 after using transferTo method: $%,d%n\n", Acc2.getBalance());
    }
}
