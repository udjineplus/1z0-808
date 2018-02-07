package com.java.bootcamp.ch003.l030;

import java.time.LocalDate;
import java.time.Month;

// What is the output of the following code?

public class L030 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}


/*
A. 2018 APRIL 4
B. 2018 APRIL 30
C. 2018 MAY 10
D. Another date.
E. The code does not compile.
F. A runtime exception is thrown.
*/

/*
 F. Java throws an exception if invalid date values are passed. There is no 40th day in April—or any other month for that matter.
*/