package com.java.bootcamp.l012;

//  What is the result of the following program?

public class Egret {
    private String color;
    public Egret() {
        this("white");
    }
    public Egret(String color) {
        color = color;
    }
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}

/*
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.
*/

/*
B. Line 10 calls the constructor on lines 3–5. That constructor calls the other constructor.
However, the constructor on lines 6–8 assigns the method parameter to itself, which leaves the color instance variable on line 2 set to its default value of null . For more information, see Chapter 4.
*/