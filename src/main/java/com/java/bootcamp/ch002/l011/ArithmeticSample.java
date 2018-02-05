package com.java.bootcamp.ch002.l011;

// What is the output of the following code?

public class ArithmeticSample {
    public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
    }
}



/*
A. 2
B. 3
C. 5
D. 6
E. The code will not compile because of line 3.
*/

/*
A. The * and % have the same operator precedence, so the expression is evaluated from left-to-right. The result of 5 * 4 is 20, and 20 % 3 is 2 (20 divided by 3 is 18, the remainder is 2). The output is 2 and option A is the correct answer.
*/