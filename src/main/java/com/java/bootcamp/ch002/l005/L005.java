package com.java.bootcamp.ch002.l005;

// What is the output of the following code snippet?

public class L005 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }
}

/*
A. 10, 14,
B. 10, 14
C. 10,
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. The code contains an infinite loop and does not terminate.
*/

/*
C. This code does not contain any compilation errors or an infinite loop, so options D, E, and F are incorrect. The break statement on line 8 causes the loop to execute once and finish, so option C is the correct answer.
*/