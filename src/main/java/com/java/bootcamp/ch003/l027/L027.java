package com.java.bootcamp.ch003.l027;

import java.util.ArrayList;
import java.util.List;

//  What is the result of the following?

public class L027 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");
        else
            System.out.println("C");
    }
}

/*
A. A
B. B
C. C
D. An exception is thrown.
E. The code does not compile.
*/

/*
B. The first if statement is false because the variables do not point to the same object. The second if statement is true because ArrayList implements equality to mean the same elements in the same order.
*/