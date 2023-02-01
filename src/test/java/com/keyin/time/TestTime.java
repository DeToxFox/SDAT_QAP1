package com.keyin.time;

/*
 * Project: QAP1
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class TestTime {
    // main method to test the Time class
    /*
     * Creating 2 time objects by setting thier values using the set methods and
     * call nextSecond and previousSecond methods for both t1 and t2 while displaying
     * the results via the toString methoddisplaying the results via the toString method
     */
    public static void main(String[] args){
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        /*
         * Testing the setTime method to see if it throws an exception
         * and if valid to roll the time over to the next day
         */
        t1.setTime(23, 59, 59);
        System.out.println("\n" + "Time(t1) set time before validation and roll over: " + t1.toString());
        System.out.println("Time(t1) validation and rolling the clock over to the next day: " + t1.nextSecond().toString());

        // Setting the time for t1
        t1.setHour(12);
        t1.setMinute(10);
        t1.setSecond(15);

        // Setting the time for t2
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Displaying the time for t1 and t2
        System.out.println("\n" + "Setting Time(t1) value to: " + t1.toString());
        System.out.println("Setting Time(t2) value to: " + t2.toString());

        // Displaying the next second for t1 and previous second for t2
        System.out.println("\n" + "Time(t1) next second: " + t1.nextSecond().toString());
        System.out.println("Time(t2) previous second: " + t2.previousSecond().toString()+"\n");
    }

}