package com.vlaskz.algorithms.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Chapter1 {

    public static void ex111() {
        /*
            Explanation:
            a) 0+15/2 exact result should return 7.5, but because of int typing, result was truncated to 7;

            b) 2.0e-6 = 2.0(double) x 10^-6(double 0.000001) = 0.000002 * 100000000.1 = 200.0000002. Floating-point
                operations should consider the maximum precision possibility;

            c) true AND false = false. true AND true result true. False OR true result true;
         */
        System.out.println("Chapter 01 - Exercise 01");
        //a)
        System.out.println("a) " + (0 + 15) / 2);
        //b)
        System.out.println("b) " + 2.0e-6 * 100000000.1);
        //c)
        System.out.println("c) " + (true && false || true && true));

        System.out.println(" ");
    }

    public static void ex112() {
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
        Object v1 = (1 + 2.236) / 2;
        System.out.println("a) Type: " + v1.getClass().getSimpleName() + " Value: " + v1);
        //b)
        Object v2 = 1 + 2 + 3 + 4.0;
        System.out.println("b) Type: " + v2.getClass().getSimpleName() + " Value: " + v2);
        //c)
        Object v3 = 4.1 >= 4;
        System.out.println("b) Type: " + v3.getClass().getSimpleName() + " Value: " + v3);
        //d)
        Object v4 = 1 + 2 + "3";
        System.out.println("b) Type: " + v4.getClass().getSimpleName() + " Value: " + v4);

        System.out.println(" ");


    }

    public static void ex113(Integer a, Integer b, Integer c) {
        /*
        This exercise takes three parameters (a, b and c) and tests is they are equal, printing the result in console.
         */
        System.out.println("Chapter 1 - Exercise 1.1.3");
        System.out.println(a == b && a == c ? "Equal\n" : "Not Equal\n");
    }

    public static void ex114() {
        System.out.println("Chapter 1 - Exercise 1.1.4");
        System.out.println("a)The statement 'if (a>b) then c=0;' causes an error, because there's no 'then' clause in " +
                "Java");
        System.out.println("b)The statement 'if (a>b){ c=0;}' is ok");
        System.out.println("c)The statement 'if (a>b) c=0;' is ok");
        System.out.println("b)The statement 'if (a>b) c=0 else b=0' causes an error by missing semicolon(;) in the " +
                "first instruction");
        System.out.println(" ");
    }

    public static void ex115(Double x, Double y) {
        System.out.println("Chapter 1 - Exercise 1.1.5");
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
        System.out.println(" ");

    }

    public static void ex116() {
        /*
        This calculate Fibonacci series, to its 16th term (change the stop condition in for-loop to get another terms).
        int f is the first parameter, where int g is the second.
        Fibonacci works this way: the next term is the sum of the last two terms. 'f' term holds the sum of all series,
            while 'g' is the next value to be increased.
        Personally I think this algorithm is very well designed. There's various other approaches.

         */
        System.out.println("Chapter 1 - Exercise 1.1.6");
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.println(" ");
    }

    public static void ex117() {
        /*
            a) Oversimplified Square root algorithm.
            b) The sum of first i terms.
            c) Displays from 0 to i with j stepping.

         */
        System.out.println("Chapter 1 - Exercise 1.1.7 ");
        //a)
        System.out.println("a)");
        Double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
        System.out.println(" ");

        //b)
        System.out.println("b)");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
            StdOut.println(sum);
        }
        System.out.println(" ");

        //c throws an error: There's no N var declared, so I declared an arbitrary number.)
        System.out.println("c)");
        int sum2 = 0;
        int N = 10;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < N; j++) {
                sum2++;
            }
            StdOut.println(sum2);
        }
        System.out.println("");
    }

    public static void ex118() {
        /*
            a) Will print b (the char);
            b) Will print 197 because there's a sum of the values of (int)'b'[value:98] and (int)'c'[value:99] = 197;
            c) will print e (char), because it adds more 4 in the position of 'a' pointer and converts to char again:
                a,b,c,d,e
                0,1,2,3,4
                        ^ the pointer after sum. And yes, Java handles pointers in the backstage;
         */
        System.out.println("Chapter 1 - Exercise 1.1.8");

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));

        System.out.println(" ");
    }

    public static void ex119(Integer N) {
        /*
            This method explains how we can convert from integer to a binary. Actually a string that shows the binary
                code for this integer. The idea is: get the remainder of number by two, add to string, and divide by two,
                repeating until the number is zero.
         */
        System.out.println("Chapter 1 - Exercise 1.1.9");

        String s = "";
        for (int i = N; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        StdOut.println(s);

        System.out.println(" ");
    }

    public static void ex1110() {
        /* 
            The a variable wasn't initialized, so the code will fail. To make is runnable, I have initialized.
         */
        System.out.println("Chapter 1 - Exercise 1.1.10");

        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
            StdOut.println(a[i]);
        }

        System.out.println(" ");
    }

    public static void ex1111(Boolean arr[][]) {
        /*
            This algorithm just substitutes the boolean matrix by asterisks and spaces.
         */
        System.out.println("Chapter 1 - Exercise 1.1.11");

        var width = arr.length;
        var height = arr[0].length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                StdOut.print(arr[i][j] ? "*" : " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void ex1112() {
        /*
         This method creates a numerical vertical palindrome with the given length. In the book, we are solicited to
            print i, but this leads to print just 0..9. Instead, I printed a[i] and voìla: there's the result.
         */
        System.out.println("Chapter 1 - Exercise 1.1.12");

        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        System.out.println(" ");
    }

    public static void ex1113(Object a[][]) {
        /*
            This exercise is a matrix trasposition (where lines becomes columns and columns, lines).
         */
        System.out.println("Chapter 1 - Exercise 1.1.13");

        var c = a.length;
        var r = a[0].length;


        Object t[][] = new Object[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                t[j][i] = a[i][j];
                System.out.print(a[i][j] + " ");

            }
            System.out.println(" ");
        }

        for(int i = 0; i < r;i++){
            for(int  j = 0;j < c;j++){
                StdOut.print(t[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
    }
}

    

