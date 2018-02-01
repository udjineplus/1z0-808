package com.java.bootcamp.l014;

//  Assuming we have a valid, non-null HenHouse object whose value is initialized by the blank line shown here, which of the following are possible outputs of this application? (Choose all that apply)


import java.util.LinkedList;
import java.util.List;

class Chicken {}

interface HenHouse { public java.util.List<Chicken> getChickens(); }

public class ChickenSong {
    public static void main(String[] args) {
//        HenHouse house = ______________
//        Chicken chicken = house.getChickens().get(0); // 6
//        for(int i=0; i<house.getChickens().size(); chicken = house.getChickens().get(i++)) {
//            System.out.println("Cluck");
//        }
    }
}

/*
A. The code will not compile because of line 6.
B. The code will not compile because of lines 7–8.
C. The application will compile but not produce any output.
D. The application will output Cluck exactly once.
E. The application will output Cluck more than once.
F. The application will compile but produce an exception at runtime.
*/

/*
D, E, F. The code compiles without issue, so options A and B are incorrect.
If house .getChickens() returns an array of one element, the code will output Cluck once, so option D is correct.
If house.getChickens() returns an array of multiple elements, the code will output Cluck once for each element in the array, so option E is correct.
Alternatively, if house.getChickens() returns an array of zero elements, then the code will
throw an IndexOutOfBoundsException on the call to house.getChickens().get(0); therefore, option C is not possible and option F is correct. The code will also throw an exception if the array returned by house.getChickens() is null, so option F is possible under multiple circumstances. For more information, see Chapter 2.
*/