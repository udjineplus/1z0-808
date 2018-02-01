package com.java.bootcamp.l018;

//  Which of the following print out a date representing April 1, 2015? (Choose all that apply)

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class L018 {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
        // System.out.println(new LocalDate(2015, 3, 1));
        // System.out.println(new LocalDate(2015, 4, 1))
    }
}

/*
A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
C. System.out.println(LocalDate.of(2015, 3, 1));
D. System.out.println(LocalDate.of(2015, 4, 1));
E. System.out.println(new LocalDate(2015, 3, 1));
F. System.out.println(new LocalDate(2015, 4, 1))
*/

/*
B, D. The new date APIs added in Java 8 use static methods rather than a constructor to create a new date, making options E and F incorrect. The months are indexed starting with 1 in these APIs, making options A and C incorrect. Option A uses the old Calendar constants which are indexed from 0. Therefore, options B and D are correct. For more information, see Chapter 3.
*/