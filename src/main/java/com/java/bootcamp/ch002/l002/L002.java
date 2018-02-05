package com.java.bootcamp.ch002.l002;

// What data type (or types) will allow the following code snippet to compile? (Choose all that apply)


public class L002 {
    public static void main(String[] args) {
        byte x = 5;
        byte y = 10;
        int z1 = x + y;
        long z2 = x + y;
        // boolean z3 = x + y;
        double z4 = x + y;
        // short z11 = x + y;
        //byte z6 = x + y;
    }
}

/*
A. int
B. long
C. boolean
D. double
E. short
F. byte
*/

/*
A, B, D. The value x + y is automatically promoted to int, so int and data types that can be promoted automatically from int will work. Options A, B, D are such data types. Option C will not work because boolean is not a numeric data type. Options E and F will not work without an explicit cast to a smaller data type.
*/