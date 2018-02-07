package com.java.bootcamp.ch003.l009;

// What is the result of the following code?

public class L009 {
    public static void main(String[] args) {
        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += " two";
        System.out.println(s.length());
    }
}

/*
A. 2
B. 4
C. 8
D. 10
E. An exception is thrown.
F. The code does not compile.
*/

/*
C. This question is trying to see if you know that String objects are immutable. Line 4 returns "PURR" but the result is ignored and not stored in s. Line 5 returns "purr" since there is no whitespace present but the result is again ignored. Line 6 returns "ur" because it starts with index 1 and ends before index 3 using zero-based indexes. The result is ignored again. Finally, on line 6 something happens. We concatenate four new characters to s and now have a String of length 8.
*/