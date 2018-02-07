package com.java.bootcamp.ch003.l004;

// What is the result of the following code?

public class L004 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }
}

/*
A. abbaaccc
B. abbaccca
C. bbaaaccc
D. bbaaccca
E. An exception is thrown.
F. The code does not compile.
*/

/*
B. This example uses method chaining. After the call to append(), sb contains "aaa". That result is passed to the first insert() call, which inserts at index 1. At this point sb contains abbbaa. That result is passed to the final insert(), which inserts at index 4, resulting in abbaccca.
*/