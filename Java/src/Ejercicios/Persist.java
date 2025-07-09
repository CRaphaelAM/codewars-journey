package Ejercicios;

import java.util.Arrays;

/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
 */

class Persist {
    public static int persistence(long n) {

        //var digits = String.valueOf(n).split("");
        String[] digits;
        int counter = 0;

        while (true) {
            digits = String.valueOf(n).split("");

            if (digits.length == 1) break;

            n = Arrays.stream(digits)
                    .mapToLong(Long::parseLong).
                    reduce(1, (m, d) -> m * d);
            counter++;
        }
        return counter;
    }
}
