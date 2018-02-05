package com.java.bootcamp.ch002.l016;

// What is the output of the following code snippet?

public class L016 {
    public static void main(String[] args) {
//        do {
//            int y = 1;
//            System.out.print(y++ + " ");
//        } while(y <= 10);
    }
}


/*
A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. The code will not compile because of line 6.
E. The code contains an infinite loop and does not terminate.
*/

/*
D. The variable y is declared within the body of the do-while statement, so it is out of scope on line 6. Line 6 generates a compiler error, so option D is the correct answer.
*/