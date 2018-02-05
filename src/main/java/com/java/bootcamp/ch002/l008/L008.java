package com.java.bootcamp.ch002.l008;

// What is the output of the following code snippet?

public class L008 {
    public static void main(String[] args) {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);
    }
}

/*
A. true, 10, true
B. true, 20, false
C. false, 20, true
D. false, 20, false
E. false, 20, true
F. The code will not compile because of line 5.
*/

/*
B. This example is tricky because of the second assignment operator embedded in line 5. The expression (z=false) assigns the value false to z and returns false for the entire expression. Since y does not equal 10, the left-hand side returns true; therefore, the exclusive or (^) of the entire expression assigned to x is true. The output reflects these assignments, with no change to y, so option B is the only correct answer. The code compiles and runs without issue, so option F is not correct.
*/
