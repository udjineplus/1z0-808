package com.java.bootcamp.ch003.l014;

// Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)

public class L014 {
    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder("Java");
        // INSERT CODE HERE
        System.out.println(puzzle);
    }
}

/*
A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E. None of the above.
*/

/*
A, C. The reverse() method is the easiest way of reversing the characters in a StringBuilder; therefore, option A is correct. Option B is a nice distraction—it does in fact return "avaJ". However, substring() returns a String, which is not stored anywhere. Option C uses method chaining. First it creates the value "JavavaJ$". Then it removes the first three characters, resulting in "avaJ$". Finally, it removes the last character, resulting in "avaJ". Option D throws an exception because you cannot delete the character after the last index. Remember that deleteCharAt() uses indexes that are zero based and length() counts starting with 1.
*/