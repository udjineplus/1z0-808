package com.java.bootcamp.ch002.l009;

// How many times will the following code print "Hello World"?

public class L009 {
    public static void main(String[] args) {
        for(int i=0; i<10 ; ) {
            i = i++;
            System.out.println("Hello World");
        }
    }
}

/*
A. 9
B. 10
C. 11
D. The code will not compile because of line 3.
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.
*/



/*
F. In this example, the update statement of the for loop is missing, which is fine as the statement is optional, so option D is incorrect. The expression inside the loop increments i but then assigns i the old value. Therefore, i ends the loop with the same value
that it starts with: 0. The loop will repeat infinitely, outputting the same statement over and over again because i remains 0 after every iteration of the loop.
*/
