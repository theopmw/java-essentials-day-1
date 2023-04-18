package usingarrays;

import java.util.Arrays;

// Generally best to avoid using them
// Arrays can be multidimensional, see arrays example in course notes

public class Example {
    public static void main(String[] args) {


        int [] ia = new int[4];
        System.out.println(ia);
        System.out.println(Arrays.toString(ia)); // [0, 0, 0, 0]
        System.out.println(ia.length); // 4
        ia[0] = 99;
        System.out.println(ia[0]); // 99

        // initialised allocated form of an array
//        String [] names = new String[] {"Fred", "Jim", "Sheila"};

        // short form
//        String [] names = {"Fred", "Jim", "Sheila"};
    }
}
