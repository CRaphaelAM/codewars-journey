package Ejercicios;

import java.util.Arrays;

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
