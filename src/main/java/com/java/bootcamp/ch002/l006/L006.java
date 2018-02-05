package com.java.bootcamp.ch002.l006;

// What is the output of the following code snippet?

public class L006 {
    public static void main(String[] args) {
        int x = 4; // 3
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        // else System.out.println("Too High");
    }
}

/*
A. Too Low
B. Just Right
C. Too High
D. Compiles but throws a NullPointerException.
E. The code will not compile because of line 6.
F. The code will not compile because of line 7.
*/

/*
F. The code does not compile because two else statements cannot be chained together without additional if-then statements, so the correct answer is option F. Option E is incorrect as Line 6 by itself does not cause a problem, only when it is paired with Line 7. One way to fix this code so it compiles would be to add an if-then statement on line 6. The other solution would be to remove line 7.
*/