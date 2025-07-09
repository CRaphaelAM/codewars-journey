package Ejercicios;

public class Solution {
    public static String camelCase(String input) {
        final String matcherRegEx = "([a-z])([A-Z])";
        final String replacerRegEx = "$1 $2";

        return input.replaceAll(matcherRegEx, replacerRegEx);
    }
}
