package Ejercicios;

import java.util.Set;

class Vowels {
    static final Set<Character> vocales = Set.of('a', 'e', 'i', 'o', 'u');

    public static int getCount(String str) {
        return (int) str.chars().filter(ch -> vocales.contains((char) ch)).count();
    }

}
