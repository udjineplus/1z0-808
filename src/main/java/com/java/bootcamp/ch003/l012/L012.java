package com.java.bootcamp.ch003.l012;

// What is the result of the following code? (Choose all that apply)

public class L012 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2,  8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }
}

/*
A. 01+89–
B. 012+9–
C. 012+–9
D. 0123456789
E. An exception is thrown.
F. The code does not compile.
*/

/*
A. First, we delete the characters at index 2 until the character one before index 8. At this point, 0189 is in numbers. The following line uses method chaining. It appends a dash to the end of the characters sequence, resulting in 0189–, and then inserts a plus sign at index 2, resulting in 01+89–.
*/