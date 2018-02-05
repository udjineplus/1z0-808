package com.java.bootcamp.ch002.l007;

// What is the output of the following code?

public class TernaryTester {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}


/*
A. 5
B. 4
C. 10
D. 8
E. 7
F. The code will not compile because of line 4.
*/

/*
D. As you learned in the section “Ternary Operator,” although parentheses are not required, they do greatly increase code readability, such as the following equivalent statement: System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7) We apply the outside ternary operator fi rst, as it is possible the inner ternary expression may never be evaluated. Since (x>2) is true, this reduces the problem to: System.out.println((x < 4) ? 10 : 8) Since x is greater than 2, the answer is 8, or option D in this case.
*/