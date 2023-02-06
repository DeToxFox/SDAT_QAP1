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
    @Test
    public void testNextSecond() {
        Time testingNextSecond = new Time(12,10,15);

        int timeFwd1Second = testingNextSecond.nextSecond().getSecond();

        // assertions that time1Second is equal to 16 seconds vs the whole time object of 12:10:16
        Assertions.assertEquals(16, timeFwd1Second);

        System.out.println("Moving time forward 1 second to " + timeFwd1Second + " seconds" + ", this assertion passed \n");
    }

    @Test  // do the same of next second
    public void testPreviousSecond() {
        Time testingPreviousSecond = new Time(10, 20, 25);

        int timePrev1Second = testingPreviousSecond.previousSecond().getSecond();

        // assertion to test equality of t1 next second
        Assertions.assertEquals(24, timePrev1Second);

        System.out.println("Moving time backward 1 second to " + timePrev1Second + " seconds" + ", this assertion passed \n");

    }

    @Test // test setTime if statement for validation and rolling forward
    public void testSetTime() {
        Time testingSetTime = new Time(23, 59, 59);
        // calling the nextSecond method to roll over the hour converting the time object to a string
        // intentionally setting a time that throws an exception, comment in to test
//        testingSetTime.setTime(25, 59, 59);

        System.out.println("testingSetTime.setTime(23, 59, 59) = " + testingSetTime);

        // assertion to test equality of t1 next second
        Assertions.assertEquals("23:59:59", testingSetTime.toString());

        System.out.println("testingSetTime after calling setTime(23, 59, 59) = " + testingSetTime + ", this assertion passed \n");
    }

    @Test // Test the toString method for the time object
    public void testToString() {
        Time testingToString = new Time(12, 10, 15);

        String timeToString = testingToString.toString();

        Assertions.assertTrue(timeToString.equals("12:10:15"));

        System.out.println("Testing toString() in the Time class= " + timeToString + ", this assertion passed \n");
    }

}