package com.java.bootcamp.ch003.l006;

// What is the result of the following code?

public class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }
}

/*
A. roar roar
B. roar roar!!!
C. roar!!! roar
D. roar!!! roar!!!
E. An exception is thrown.
F. The code does not compile.
*/

/*
B. A String is immutable. Calling concat() returns a new String but does not change the original. A StringBuilder is mutable. Calling append() adds characters to the existing character sequence along with returning a reference to the same object.
*/