package Ejercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position
 the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive
numbers.
*/

class Order {
    public static String order(String words) {
        if (words.isBlank()) return "";

        String regex = "\\d+";

        var wordsArr = words.strip().split(" ");
        var wordsOrderMap = new HashMap<String, Integer>();

        for (var w : wordsArr) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(w);
            Integer pos = null;
            if (matcher.find())
                pos = Integer.parseInt(matcher.group());

            wordsOrderMap.put(w, pos);
        }

        return Arrays.stream(wordsArr)
                .sorted(Comparator.comparing(wordsOrderMap::get))
                .collect(Collectors.joining(" "));
    }
}
