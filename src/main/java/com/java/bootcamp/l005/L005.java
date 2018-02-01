package com.java.bootcamp.l005;

// What is the output of the following code snippet?
public class L005 {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }
}

/*
A. abe
B. abce
C. abde
D. abcde
E. The code does not compile.
F. An uncaught exception is thrown.
*/

/*
D. The code starts running and prints a and b on lines 13 and 15. Line 16 throws an exception, which is caught on line 17. After line 18 prints c, the finally block is run and d is printed. Then the try statement ends and e is printed on line 22. For more information, see Chapter 6.
*/
