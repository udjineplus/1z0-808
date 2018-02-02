package com.java.bootcamp.ch001.l021;

// What does the following code output?

public class Salmon {
    int count;
    public void Salmon() {
        count = 4;
    }

    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.count);
    }
}

/*
A. 0
B. 4
C. Compilation fails on line 3.
D. Compilation fails on line 4.
E. Compilation fails on line 7.
F. Compilation fails on line 8.
*/

/*
A. While the code on line 3 does compile, it is not a constructor because it has a return type. It is a method that happens to have the same name as the class. When the code runs, the default constructor is called and count has the default value (0) for an int.
*/