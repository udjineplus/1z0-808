package com.java.bootcamp.ch003.l002;

// Which of the following are output by this code? (Choose all that apply)

public class L002 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
    }
}

/*
A. one *
B. two
C. three *
D. four *
E. five
F. The code does not compile.
*/

/*
A, C, D. The code compiles fine. Line 3 points to the String in the string pool. Line 4 calls the String constructor explicitly and is therefore a different object than s . Lines 5 and 7 check for object equality, which is true, and so print one and three. Line 6 uses object reference equality, which is not true since we have different objects. Line 7 also compares references but is true since both references point to the object from the string pool. Finally, line 8 compares one object from the string pool with one that was explicitly constructed and returns false.
*/