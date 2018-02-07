package com.java.bootcamp.ch003.l024;

import java.util.List;

// What is the result of the following?

// TODO
public class L024 {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};
        // List<String> list = names.asList();  // 7
        // list.set(0, "Sue");
        System.out.println(names[0]);
    }
}

/*
A. Sue
B. Tom
C. Compiler error on line 7.
D. Compiler error on line 8.
E. An exception is thrown.
*/

/*
C. Converting from an array to an ArrayList uses Arrays.asList(names). There is no asList() method on an array instance. If this code were corrected to compile, the answer would be option A.
*/