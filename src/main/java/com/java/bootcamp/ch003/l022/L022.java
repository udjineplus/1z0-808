package com.java.bootcamp.ch003.l022;

import java.util.Arrays;


//  What is the result of the following?

public class L022 {
    public static void main(String[] args) {
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}

/*
A. 2
B. 4
C. 6
D. The result is undefined.
E. An exception is thrown.
F. The code does not compile.
*/

/*
 D. The code compiles and runs fine. However, an array must be sorted for binarySearch() to return a meaningful result.
*/