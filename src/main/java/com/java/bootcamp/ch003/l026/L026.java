package com.java.bootcamp.ch003.l026;

import java.util.ArrayList;
import java.util.List;

//  Which of the following are true statements about the following code? (Choose all that apply)

// TODO

public class L026 {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); // 5
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age);
    }
}

/*
A. The code compiles.
B. The code throws a runtime exception.
C. Exactly one of the add statements uses autoboxing.
D. Exactly two of the add statements use autoboxing.
E. Exactly three of the add statements use autoboxing.
*/

/*
 A, B, D. Lines 5 and 7 use autoboxing to convert an int to an Integer. Line 6 does not because valueOf() returns an Integer. Line 8 does not because null is not an int. The code does not compile. However, when the for loop tries to unbox null into an int, it fails and throws a NullPointerException.
*/