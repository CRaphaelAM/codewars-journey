package Ejercicios;

import java.util.stream.Collectors;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z
at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */
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
