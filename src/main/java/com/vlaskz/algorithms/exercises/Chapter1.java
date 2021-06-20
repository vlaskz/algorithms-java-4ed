package com.vlaskz.algorithms.exercises;

public class Chapter1 {

    public static void ex111(){
        /*
            Explanation:
            a) 0+15/2 exact result should return 7.5, but because of int typing, result was truncated to 7;
            b) 2.0e-6 = 2.0(double) x 10^-6(double 0.000001) = 0.000002 * 100000000.1 = 200.0000002
                floating-point operations should consider the maximum precision possibility;
            c) true AND false = false. true AND true result true. False OR true result true;
         */

        System.out.println((0+15)/2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    public static void ex112(){


    }
}
