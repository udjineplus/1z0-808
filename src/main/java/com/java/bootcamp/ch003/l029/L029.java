package com.java.bootcamp.ch003.l029;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.util.Calendar.DATE;

//  What is the output of the following code?

public class L029 {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_ DATE);
        // date.plusDays(2);
        // date.plusHours(3);
        // System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}

/*
A. 2018 APRIL 2
B. 2018 APRIL 30
C. 2018 MAY 2
D. The code does not compile.
E. A runtime exception is thrown.
*/

/*
 D. A LocalDate does not have a time element. Therefore, it has no method to add hours and the code does not compile.
*/