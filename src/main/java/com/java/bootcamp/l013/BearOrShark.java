package com.java.bootcamp.l013;

//  What is the output of the following program?

public class BearOrShark {
    public static void main(String[] args) {
        int luck = 10;
        if((luck>10 ? luck++: --luck)<10) {
            System.out.print("Bear");
        } if(luck<10) System.out.print("Shark");
    }
}

/*
A. Bear
B. Shark
C. BearShark
D. The code will not compile because of line 4.
E. The code will not compile because of line 6.
F. The code compiles without issue but does not produce any output.
*/

/*
C. The code compiles and runs without issue, so options D and E are correct.
Remember that only one of the right-hand ternary expressions will be evaluated at runtime.
Since luck is not less than 10, the second expression, --luck, will be evaluated, and
since the pre-increment operator was used, the value returned will be 9, which is less than 10.
So the first if-then statement will be visited and Bear will be output. Notice there is no else statement on line 6.
Since luck is still less than 10, the second if-then statement will also be reached
and Shark will be output; therefore, the correct answer is option C. For more information, see Chapter 2.
*/