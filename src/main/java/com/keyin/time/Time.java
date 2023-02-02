package com.keyin.time;

/*
 * Project: QAP1 Problem #2 The Time Class
 * Course Name: Software Design, Architecture, Testing
 * Written by: David Turner
 * Due Date: February 7, 2023
 */

public class Time {
    // instance variables
    private int hour;
    private int minute;
    private int second;

    // constructor that takes three integer parameters for hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters and Setters for the instance variables
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    /*
     * IllegalArgumentException is a built in exception handler that is
     * thrown when an argument is not valid for the method,
     * if they are valid then the values are assigned to the instance variables
     * this.hour = hour, this.minute = minute, this.second = second
     */
    public void setTime(int hour, int minute, int second) {
        if (hour < 00 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        if (minute < 00 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        if (second < 00 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // toString method that returns a string in the format of HH:MM:SS with leading zeros
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // nextSecond method that increments the time by one second and returns the new time
    public Time nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // previousSecond method that decrements the time by one second and returns the new time
    public Time previousSecond() {
        --second;
        if (second == -1) {
            second = 59;
            --minute;
            if (minute == -1) {
                minute = 59;
                --hour;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}