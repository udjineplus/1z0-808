package com.java.bootcamp.ch002.l012;

// What is the output of the following code snippet?

public class L012 {
    public static void main(String[] args) {
        int x = 0;
        String s = null;
        // if(x == s) System.out.println("Success"); // 5
        // else System.out.println("Failure");
    }
}

/*
A. Success
B. Failure
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
*/

/*
D. The variable x is an int and s is a reference to a String object. The two data types are incomparable because neither variable can be converted to the other variable’s type. The compiler error occurs on line 5 when the comparison is attempted, so the answer is option D.
*/