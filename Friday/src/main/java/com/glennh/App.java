package com.glennh;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // "In a language of your choice, using all best practice principles you’re aware of, could you please provide
        // code that A of A until X, then in multiples of A + 1 until 2X, then multiples of A + 2
        // until 3X. Please state any assumptions you’ve made. Please upload to a public Github repository and share
        // the link."

        multiplesOfAUntilX(2, 3);
        multiplesOfAUntilXLambaStyle(2,3);
        multiplesOfAPlus1Until2X(2, 3);
        multiplesOfAPlus1Until2XLamdaStyle(2, 3);
        multiplesOfAPlus2Until3X(2, 3);
        multiplesOfAPlus2Until3XLambdaStyle(2, 3);
    }


    // below the simple first try.  Time = 21 mins.
    public static void multiplesOfAUntilX(int a, int x) {
        // iterate in multiples of A until X
        System.out.printf("multiplesOfAUntilX for a=%d and x=%d%n", a, x);
        for (int i = 0; i <= x; i += a) {
            System.out.println(i);
        }
        System.out.println("");
    }

    public static void multiplesOfAPlus1Until2X(int a, int x) {
        // iterate in multiples of A + 1 until 2X
        System.out.printf("multiplesOfAPlus1Until2X for a=%d and x=%d%n", a, x);
        for (int i = 0; i <= (x * 2); i += (a + 1)) {
            System.out.println(i);
        }
        System.out.println("");
    }

    public static void multiplesOfAPlus2Until3X(int a, int x) {
        // iterate in multiples of A + 2 until 3X
        System.out.printf("multiplesOfAPlus2Until3X for a=%d and x=%d%n", a, x);
        for (int i = 0; i <= (x * 3); i += (a + 2)) {
            System.out.println(i);
        }
        System.out.println("");
    }

    // I suspect we can make this nice and lamba-ish; I don't yet think fluidly in lamba.  Lets try.
    public static void multiplesOfAUntilXLambaStyle(int a, int x) {
        // iterate in multiples of A until X
        System.out.printf("multiplesOfAUntilXLambaStyle for a=%d and x=%d%n", a, x);
        IntStream.iterate(0, j -> j <= x, i -> i + a )
                .forEach(System.out::println);
        System.out.println();
    }

    public static void multiplesOfAPlus1Until2XLamdaStyle(int a, int x) {
        // iterate in multiples of A + 1 until 2X
        System.out.printf("multiplesOfAUntilXLambaStyle for a=%d and x=%d%n", a, x);
        IntStream.iterate(0, j -> j <= (2 * x), i -> i + (a + 1) )
                .forEach(System.out::println);
        System.out.println();
    }

    public static void multiplesOfAPlus2Until3XLambdaStyle(int a, int x) {
        // iterate in multiples of A + 2 until 3X
        System.out.printf("multiplesOfAPlus2Until3XLambdaStyle for a=%d and x=%d%n", a, x);
        IntStream.iterate(0, j -> j <= (3 * x), i -> i + (a + 2) )
                .forEach(System.out::println);
        System.out.println();
    }

    // lamda style done, 43 mins elapsed, lets make sure we can get this into github before doing anything else like,
    // making some unit tests for example.
}

