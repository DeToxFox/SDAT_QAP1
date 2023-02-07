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
        Account account1 = new Account("1", "Account 1", 5000.00);
        Account account2 = new Account("2","Account 2", 4000.00);

        account1.transferTo(account2, 1000.00);

        Assertions.assertTrue(account2.getBalance() == 5000.00);
        System.out.println("testTransfer test passed");
        System.out.println("Test Transfer: accountToCredit (Acc2) balance: " + account2.getBalance());
        System.out.println("Test Transfer: accountToDebit (Acc1) balance: " + account1.getBalance() + "\n");
    }

    @Test
    public void testDebit() {
        Account accountToDebit = new Account("1", "accountToDebit", 5000.00);
//        Account accountToCredit = new Account("2","accountToCredit", 4000.00);

        accountToDebit.debit(1230.00);

        Assertions.assertTrue(accountToDebit.getBalance() == 3770.00);
        System.out.println("testDebit test passed");
        System.out.println("Test Transfer: AccountDebit balance: " + accountToDebit.getBalance() + "\n");
    }

    @Test
    public void testCredit() {
//        Account accountToDebit = new Account("1", "accountToDebit", 5000.00);
        Account accountToCredit = new Account("2","accountToCredit", 4000.00);

        accountToCredit.credit(1230.00);

        Assertions.assertTrue(accountToCredit.getBalance() == 5230.00);
        System.out.println("testCredit test passed");
        System.out.println("Test Transfer: accountToCredit balance: " + accountToCredit.getBalance() + "\n");
    }

    @Test
    public void testTransferLowBalance() {
        Account acc1 = new Account("1", "Account 1", 5000.00);
        Account acc2 = new Account("2","Account 2", 4000.00);
        // creating an Assert statement to test if the transferTo method is working correctly with error handling
        acc1.transferTo(acc2, 60000.00);

        Assertions.assertFalse(acc2.getBalance() == 64000.00);

        System.out.println("testTransferLowBalance test passed");
        System.out.println("Low Balance: accountToDebit balance: " + acc1.getBalance());
        System.out.println("Low Balance: accountToCredit balance: " + acc2.getBalance() + "\n");
    }

    @Test
    public void toStringTest(){
        // Create two Account objects
        Account testAccount = new Account("1", "Account 1", 5000);

//        System.out.println(testAccount); // to show what testAccount looks like to use as part of the test
        String test = "Account[id=1,name=Account 1,balance=5000.0]";

        // Assert that the information of testAccount using the toString method is correct
        Assertions.assertEquals(testAccount.toString(), test);
        System.out.println("toStringTest passed for testAccount values passed in as : " + testAccount.toString() + "\n");
    }
}
