package com.java.bootcamp.ch002.l003;

public class CompareValues {
    public static void main(String[] args) {
        int x = 0;
        while(x++ < 10) {}
        // String message = x > 10 ? "Greater than" : false;
        // System.out.println(message+","+x);
    }
}

/*
A. Greater than,10
B. false,10
C. Greater than,11
D. false,11
E. The code will not compile because of line 4.
F. The code will not compile because of line 5.
*/

/*
F. In this example, the ternary operator has two expressions, one of them a String and the other a boolean value. The ternary operator is permitted to have expressions that don’t have matching types, but the key here is the assignment to the String reference. The compiler knows how to assign the first expression value as a String, but the second boolean expression cannot be set as a String; therefore, this line will not compile.
*/