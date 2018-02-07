package com.java.bootcamp.ch003.l020;

import java.util.ArrayList;
import java.util.List;

public class L020 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        // list.add(7);
        for(String s : list)
            System.out.print(s);
    }
}

/*
A. onetwo
B. onetwo7
C. onetwo followed by an exception
D. Compiler error on line 9.
E. Compiler error on line 10.
*/

/*
D. The code does not compile because list is instantiated using generics. Only String objects can be added to list and 7 is an int.
*/