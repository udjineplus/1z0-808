package com.java.bootcamp.ch001.l008;

// Given the following class, which of the following calls print out Blue Jay? (Choose all that apply)

public class BirdDisplay {
    public static void main(String[] name) {
        System. out .println(name[1]);
    }
}

/*
A. java BirdDisplay Sparrow Blue Jay
B. java BirdDisplay Sparrow "Blue Jay"
C. java BirdDisplay Blue Jay Sparrow
D. java BirdDisplay "Blue Jay" Sparrow
E. java BirdDisplay.class Sparrow "Blue Jay"
F. java BirdDisplay.class "Blue Jay" Sparrow
G. Does not compile.
*/

/*
B. Option B is correct because arrays start counting from zero and strings with spaces must be in quotes. Option A is incorrect because it outputs Blue. C is incorrect because it outputs Jay. Option D is incorrect because it outputs Sparrow. Options E and F are incorrect because they output Error: Could not find or load main class BirdDisplay.class.
*/