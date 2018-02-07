package com.java.bootcamp.ch003.l021;

import java.util.ArrayList;

// What is the result of the following statements?

public class L012 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values)
            System.out.print(v);
    }
}

/*
A. 4
B. 5
C. 6
D. 46
E. 45
F. An exception is thrown.
G. The code does not compile.
*/

/*
 C. After line 4, values has one element (4). After line 5, values has two elements (4, 5). After line 6, values has two elements (4, 6) because set() does a replace. After line 7, values has only one element (6).
*/