package com.java.bootcamp.ch003.l028;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

// Which of the following can be inserted into the blank to create a date of June 21, 2014? (Choose all that apply)
// TODO
public class StartOfSummer {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2014, 5, 21));
        System.out.println(LocalDate.of(2014, 6, 21));
        System.out.println(LocalDate.of(2014, Calendar.JUNE, 21));
        System.out.println(LocalDate.of(2014, Month.JUNE, 21));
        System.out.println(LocalDate.of(2014, Month.JUNE, 21));

    }
}

/*
A. new LocalDate(2014, 5, 21);
B. new LocalDate(2014, 6, 21);
C. LocalDate.of(2014, 5, 21);
D. LocalDate.of(2014, 6, 21);
E. LocalDate.of(2014, Calendar.JUNE, 21);
F. LocalDate.of(2014, Month.JUNE, 21);
*/

/*
 D, F. Options A and B are incorrect because LocalDate does not have a public constructor. Option C is incorrect because months start counting with 1 rather than 0. Option E is incorrect because it uses the old pre–Java 8 way of counting months, again beginning with 0. Options D and F are both correct ways of specifying the desired date.
*/