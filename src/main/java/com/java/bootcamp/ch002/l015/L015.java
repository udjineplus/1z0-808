package com.java.bootcamp.ch002.l015;

public class L015 {
    public static void main(String[] args) {
        int x = 1, y = 15;  // 3
        // while x < 10
        // y––;
        x++;
        System.out.println(x+", "+y);
    }
}



/*
A. 10, 5
B. 10, 6
C. 11, 5
D. The code will not compile because of line 3.
E. The code will not compile because of line 4.
F. The code contains an infinite loop and does not terminate.
*/


/*
E. This is actually a much simpler problem than it appears to be. The while statement on line 4 is missing parentheses, so the code will not compile, and option E is the correct answer. If the parentheses were added, though, option F would be the correct answer since the loop does not use curly braces to include x++ and the boolean expression never changes. Finally, if curly braces were added around both expressions, the output would be 10, 6 and option B would be correct.
*/