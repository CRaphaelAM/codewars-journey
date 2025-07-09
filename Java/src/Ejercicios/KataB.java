package Ejercicios;

import java.util.Arrays;
import java.util.Comparator;

class KataB {
    public static int findShort(String s) {

        return Arrays.stream(s.split(" "))
                .min(Comparator.comparing(String::length))
                .get().length();
    }
}
