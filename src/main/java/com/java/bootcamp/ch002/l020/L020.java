package com.java.bootcamp.ch002.l020;

// What is the result of the following code snippet?

public class L020 {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }
    }
}



/*
A. great
B. greatgood
C. The code will not compile because of line 3.
D. The code will not compile because of line 6.
E. The code will not compile because of lines 6 and 9.
*/



/*
B. The code compiles and runs without issue, so options C, D, and E are not correct. The value of grade is 'B' and there is a matching case statement that will cause "great" to be printed. There is no break statement after the case, though, so the next case statement will be reached, and "good" will be printed. There is a break after this case statement, though, so the switch statement will end. The correct answer is thus option B.
*/