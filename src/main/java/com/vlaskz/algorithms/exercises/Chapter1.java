package com.vlaskz.algorithms.exercises;

import edu.princeton.cs.algs4.StdOut;

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
        System.out.println("a) "+(0+15)/2);
        //b)
        System.out.println("b) "+2.0e-6 * 100000000.1);
        //c)
        System.out.println("c) "+(true && false || true && true));

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

            c) The whole operation isn't arithmetic. It is a comparison: a is greater or equal to b? So the result can
                only be a boolean (true/false).

            d) The whole operations seems to be a sum, but it is a sum, then a concatenation, and generates a string in
                the end with value (1+2)+"3" = 3+"3" = "33". This is why i hate javascript.

         */
        System.out.println("Chapter 01 - Exercise 02");
        //a)
        Object v1 = (1+2.236)/2;
        System.out.println("a) Type: " + v1.getClass().getSimpleName() + " Value: "+ v1);
        //b)
        Object v2 = 1+2+3+4.0;
        System.out.println("b) Type: " + v2.getClass().getSimpleName() + " Value: " + v2);
        //c)
        Object v3 = 4.1>=4;
        System.out.println("b) Type: " + v3.getClass().getSimpleName() + " Value: " + v3);
        //d)
        Object v4 = 1+2+"3";
        System.out.println("b) Type: " + v4.getClass().getSimpleName() + " Value: " + v4);

        System.out.println(" ");



    }

    public static void ex113(Integer a, Integer b, Integer c){
        /*
        This exercise takes three parameters (a, b and c) and tests is they are equal, printing the result in console.
         */
        System.out.println("Chapter 1 - Exercise 1.1.3");
        System.out.println(a==b && a==c?"Equal\n":"Not Equal\n");
    }

    public static void ex114(){
        System.out.println("a)The statement 'if (a>b) then c=0;' causes an error, because there's no 'then' clause in " +
                "Java");
        System.out.println("b)The statement 'if (a>b){ c=0;}' is ok");
        System.out.println("c)The statement 'if (a>b) c=0;' is ok");
        System.out.println("b)The statement 'if (a>b) c=0 else b=0' causes an error by missing semicolon(;) in the " +
                "first instruction");
    }

    public static void ex115(Double x, Double y){
        System.out.println(x>0 && x<1 && y>0 && y<1);

    }

    public static void ex116(){
        /*
        This calculate Fibonacci series, to its 16th term (change the stop condition in for-loop to get another terms).
        int f is the first parameter, where int g is the second.
        Fibonacci works this way: the next term is the sum of the last two terms. 'f' term holds the sum of all series,
            while 'g' is the next value to be increased.
        Personally I think this algorithm is very well designed. There's various other approaches.

         */
        int f = 0;
        int g = 1;
        for(int i = 0; i<=15;i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
