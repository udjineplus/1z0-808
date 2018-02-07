package com.java.bootcamp.ch003.l025;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L025 {
    public static void main(String[] args) { // 30 3A 8 FF
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8"); // 2
        int y = Collections.binarySearch(hex, "3A"); // 1
        int z = Collections.binarySearch(hex, "4F"); // -3
        System.out.println(x + " " + y + " " + z);
    }
}

/*
A 0 1 –2
B. 0 1 –3
C. 2 1 –2
D. 2 1 –3
E. None of the above. F. The code doesn’t compile.
*/

/*
 D. After sorting, hex contains [30, 3A, 8, FF]. Remember that numbers sort before letters and strings sort alphabetically. This makes 30 come before 8. A binary search correctly finds 8 at index 2 and 3A at index 1. It cannot find 4F but notices it should be at index 2. The rule when an item isn’t found is to negate that index and subtract 1. Therefore, we get –2–1, which is –3.
*/
