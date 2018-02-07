package com.java.bootcamp.ch003.l023;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TODO
public class L023 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);
    }
}

/*
A. –1
B. 10
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. An exception is thrown.
*/

/*
A. Line 4 creates a fixed size array of size 4. Line 5 sorts it. Line 6 converts it back to an array. The brackets aren’t in the traditional place, but they are still legal. Line 7 prints the first element, which is now –1.
*/