package com.vlaskz.algorithms.exercises;

public class Chapter1 {

    public static void ex111(){
        /*
            Explanation:
            a) 0+15/2 exact result should return 7.5, but because of int typing, result was truncated to 7;

            b) 2.0e-6 = 2.0(double) x 10^-6(double 0.000001) = 0.000002 * 100000000.1 = 200.0000002. Floating-point
                operations should consider the maximum precision possibility;

            c) true AND false = false. true AND true result true. False OR true result true;
         */
        System.out.println("Chapter 01 - Exercise 01");
        //a)
        System.out.println((0+15)/2);
        //b)
        System.out.println(2.0e-6 * 100000000.1);
        //c)
        System.out.println(true && false || true && true);

        System.out.println(" ");
    }

    public static void ex112(){
        /*
            **Note: Object class was used to force type inference by compiler. The method getClass().getSimpleName returns
                the RUNTIME type inferred by JVM.**

            a) (1+2.236)/2 results in a double, because in the sum, the result is 3.236, thus becoming a floating-point
                number. Also, the final result is a division of double/int, which results in double with value 1.618.

            b) Same case here. When we have arithmetical operations involving numerical types, the compiler always cast
                the result to most comprehensive type. In this case, is double.
         */
        System.out.println("Chapter 01 - Exercise 02");
        //a)
        Object v1 = (1+2.236)/2;
        System.out.println("Type: " + v1.getClass().getSimpleName() + " Value: "+ v1);
        //b)
        Object v2 = 1+2+3+4.0;
        System.out.println("Type " + v2.getClass().getSimpleName() + " Value: " + v2);

        System.out.println(" ");

    }
}
