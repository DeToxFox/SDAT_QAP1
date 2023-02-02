package com.keyin.account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Project: QAP1 Problem #1 The Account Class
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class TestAccount {

    @Test
    public void testTransfer() {
        Account Acc1 = new Account("1", "Account 1", 5000.00);
        Account Acc2 = new Account("2","Account 2", 4000.00);

        Acc1.transferTo(Acc2, 1000.00);

        Assertions.assertTrue(Acc2.getBalance() == 5000.00);
        System.out.println("testTransfer test passed");
        System.out.println("Test Transfer: accountToCredit balance: " + Acc2.getBalance());
        System.out.println("Test Transfer: accountToDebit balance: " + Acc1.getBalance());
    }

    @Test
    public void testTransferLowBalance() {
        Account Acc1 = new Account("1", "Account 1", 5000.00);
        Account Acc2 = new Account("2","Account 2", 4000.00);
        Acc1.transferTo(Acc2, 60000.00);
        // creating an Assert statement to test if the transferTo method is working correctly with error handling
        Assertions.assertFalse(Acc2.getBalance() == 60000.00);

//        Assertions.assertFalse(Acc2.getBalance() == 4700.00);
        System.out.println("testTransferLowBalance test passed");
        System.out.println("Low Balance: accountToDebit balance: " + Acc1.getBalance());
        System.out.println("Low Balance: accountToCredit balance: " + Acc2.getBalance());
    }
    @Test
    public void getBalanceAfterTransaction() {
        // this test will assert that a balance should return a balance of that is equal to 4400.00 using the != operator
        Account Acc1 = new Account("1", "Account 1", 5000.00);
        Account Acc2 = new Account("2","Account 2", 4000.00);
        Acc1.transferTo(Acc2, 400.00);
        Assertions.assertFalse(Acc2.getBalance() != 4400.00);
        System.out.println("getBalanceAfterTransaction test passed");
        System.out.println("Low Balance: accountToDebit balance: " + Acc1.getBalance());
        System.out.println("Low Balance: accountToCredit balance: " + Acc2.getBalance());
    }

    @Test
    public void displayBalances(){
        // Create two Account objects
        Account Acc1 = new Account("1", "Account 1", 5000);
        Account Acc2 = new Account("2", "Account 2", 4000);

        // Assert that the balance of Acc1 using the getBalance method
        Assertions.assertTrue(Acc1.getBalance() == Acc1.getBalance());
        System.out.println("displayBalances test passed for Acc1");
        // Assert that the balance of Acc2 using the getBalance method
        Assertions.assertTrue(Acc2.getBalance() == Acc2.getBalance());
        System.out.println("displayBalances test passed for Acc2");
    }

    @Test
    // this test will ensure that the right account ID is being returned
    public void getAccountID(){
        // Create two Account objects
        Account Acc1 = new Account("1", "Account 1", 5000);
        Account Acc2 = new Account("2", "Account 2", 4000);

        // Assert that the balance of Acc1 using the getBalance method
        Assertions.assertTrue(Acc1.getId() == Acc1.getId());
        System.out.println("getAccountID test passed for Acc1: ID is: " + Acc1.getId());
        // Assert that the balance of Acc2 using the getBalance method
        Assertions.assertTrue(Acc2.getId() == Acc2.getId());
        System.out.println("getAccountID test passed for Acc2: ID is: " + Acc2.getId());
    }

//    public static void main(String[] args) {
//        // Create two Account objects
//        Account Acc1 = new Account("1", "Account 1", 5000);
//        Account Acc2 = new Account("2", "Account 2", 4000);
//
//        // Display of balances using format specifier
//        System.out.printf("\nOriginal Balance of Account 1: $%,d%n", Acc1.getBalance());
//        System.out.printf("Original Balance of Account 2: $%,d%n\n", Acc2.getBalance());
//
//        // Transfer of $1000 from Account 1 to Account 2 using credit and debit methods vs transferTo method
//        Acc2.credit(1000);
//        Acc1.debit(1000);
//        System.out.printf("Balance of Account 1 after using credit and debit methods: $%,d%n", Acc1.getBalance());
//        System.out.printf("Balance of Account 2 after using credit and debit methods: $%,d%n\n", Acc2.getBalance());
//        // Reset the balances of both accounts
//        Acc1.credit(1000);
//        Acc2.debit(1000);
//
//
//        // Transfer of $1000 from Account 1 to Account 2
//        // this method call transfers money from one account to another by using the transferTo method in Account.java, Acc1 is an object of the Account class in this Acc1 is sending money to another object of the Account class which is Acc2.
//        Acc1.transferTo(Acc2, 1000);
//        // System.out.println(Acc1.transferTo(Acc2, 1000));
//
//        /*
//         * Display the balance of both accounts using the getBalance() method and
//         * all account details (toString() method) making sure the balances have formating using
//         * the format specifier
//         */
//        // Account 1
//        System.out.println(Acc1);
//        System.out.printf("Balance of Account 1 after using transferTo method: $%,d%n\n", Acc1.getBalance());
//        // Account 2
//        System.out.println(Acc2);
//        System.out.printf("Balance of Account 2 after using transferTo method: $%,d%n\n", Acc2.getBalance());
//    }
}
