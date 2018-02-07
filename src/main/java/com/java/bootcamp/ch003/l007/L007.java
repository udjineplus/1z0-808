package com.java.bootcamp.ch003.l007;

// Which are the results of the following code? (Choose all that apply)

public class L007 {
    public static void main(String[] args) {
        String letters = "abcdef";
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));
        System.out.println(letters.charAt(6));
    }
}

/*
A. 5
B. 6
C. c
D. d
E. An exception is thrown.
F. The code does not compile.
*/

/*
B, D, E. length() is simply a count of the number of characters in a String. In this case, there are six characters. charAt() returns the character at that index. Remember that indexes are zero based, which means that index 3 corresponds to d and index 6 corresponds to 1 past the end of the array. A StringIndexOutOfBoundsException is thrown for the last line.
*/