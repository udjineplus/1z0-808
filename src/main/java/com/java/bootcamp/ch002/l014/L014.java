package com.java.bootcamp.ch002.l014;

//  What is the output of the following code snippet?

public class L014 {
    public static void main(String[] args) {
        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);
    }
}


/*
A. 8
B. 11
C. 12
D. 15
E. 16
F. The code will not compile because of line 5.
*/

/*
C. The code compiles successfully, so option F is incorrect. On line 5, the pre-increment operator is used, so c is incremented to 4 and the new value is returned to the expression. The value of result is computed by adding 4 to the original value of 8, resulting in a new value of 12, which is output on line 6. Therefore, option C is the correct answer.
*/