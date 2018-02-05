package com.java.bootcamp.ch002.l010;




//  What is the output of the following code?

public class L010 {
    public static void main(String[] args) {
        byte a = 40, b = 50;
        // byte sum = (byte) a + b;
        // System.out.println(sum);
    }
}




/*
A. 40
B. 50
C. 90
D. The code will not compile because of line 4.
E. An undefined value.
*/

/*
D. Line 4 generates a possible loss of precision compiler error. The cast operator has the highest precedence, so it is evaluated first, casting a to a byte. Then, the addition is evaluated, causing both a and b to be promoted to int values. The value 90 is an int and cannot be assigned to the byte sum without an explicit cast, so the code does not compile. The code could be corrected with parentheses around (a + b), in which case option C would be the correct answer.
*/