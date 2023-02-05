package com.keyin.time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Project: QAP1 Problem #2 The Time Class
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class TestTime {
    @Test // dont test setter and getters possible remove
    public void setTestTime(){
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

        Assertions.assertTrue(t1.getHour() == 12 );
        Assertions.assertNotEquals(10, t1.getHour());

        // Displaying the time for t1 and t2
        System.out.println("\n" + "Setting Time(t1) value to: " + t1.toString());
        System.out.println("Setting Time(t2) value to: " + t2.toString());

        // Displaying the that the assertions passed
        System.out.println("\n" + "setTestTime test passed");
    }

    @Test
    public void testNextSecond() {
        Time testingNextSecond = new Time(12,10,15);
//        Time t1 = new Time(0, 0, 0);
//        Time t2 = new Time(0, 0, 0);
//        // Setting the time for t1
//        t1.setHour(12); // move all set times to the object creation, only test 1 object
//        t1.setMinute(10);
//        t1.setSecond(15);
//        // Setting the time for t2
//        t2.setHour(10);
//        t2.setMinute(20);
//        t2.setSecond(25);
        // used to hold the value of the next second from t1, this is used in the assertion test equals
        // expecting a value of 16
        int time1Second = testingNextSecond.nextSecond().getSecond();

        // assertions that time1Second is equal to 16 seconds vs the whole time object of 12:10:16
        Assertions.assertEquals(16, time1Second);
//        Assertions.assertEquals(16, time1Second);
        System.out.println("time1Second: " + time1Second + " this assertion passed");
//        // resetting the time for t1 prior to the next item in the stack
//        t1.setTime(12, 10, 15);
//        // assertion to test equality of t1 next second
//        Assertions.assertEquals("12:10:16", t1.nextSecond().toString());
//        // Displaying that the assertion passed
//        System.out.println("\n" + "testNextSecond test passed");
//        // resetting the time for t1 prior to the next item in the stack
//        t1.setTime(12, 10, 15);
//        // Displaying the time for t1 prior to the next second
//        System.out.println("\n" + "Time(t1) before next second: " + t1);
//        // Displaying the time for t1 after the next second
//        System.out.println("\n" + "Time(t1) after next second: " + t1.nextSecond().toString());

    }

    @Test  // do the same of next second
    public void testPreviousSecond() {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);
        // Setting the time for t1
        t1.setHour(12);
        t1.setMinute(10);
        t1.setSecond(15);
        // Setting the time for t2
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // assertion to test equality of t1 next second
        Assertions.assertEquals("10:20:24", t2.previousSecond().toString());
        // Displaying that the assertion passed
        System.out.println("\n" + "testPreviousSecond test passed");
        // resetting the time for t2 prior to the next item in the stack
        t2.setTime(10, 20, 25);
        // Displaying the time for t2 prior to the next second
        System.out.println("\n" + "Time(t2) before previous second: " + t2);
        // Displaying the time for t2 after the next second
        System.out.println("\n" + "Time(t2) after previous second: " + t2.previousSecond().toString());

    }

}