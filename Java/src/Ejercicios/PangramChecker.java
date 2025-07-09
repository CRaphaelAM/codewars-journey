package Ejercicios;

import java.util.stream.Collectors;

class PangramChecker {
    public static boolean check(String sentence) {
        final int totalLetters = (int) 'z' - (int) 'a' + 1;

        var charSet = sentence.toLowerCase().
                chars().
                filter(ch -> ch >= 'a' && ch <= 'z').
                mapToObj(ch -> (char) ch).
                collect(Collectors.toSet());

        return charSet.size() == totalLetters;
    }
}
