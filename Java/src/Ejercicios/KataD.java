package Ejercicios;

import java.util.HashMap;
import java.util.Map;


/*
The main idea is to count all the occurring characters in a string. If you have a string like aba,
then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.

*/

class KataD {
    public static Map<Character, Integer> count(String str) {

        var counter = new HashMap<Character, Integer>();

        str.chars().mapToObj(ch -> (char) ch).forEach(ch -> counter.merge(ch, 1, Integer::sum));

        return counter;
    }
}
