package Ejercicios;

import java.util.HashMap;
import java.util.Map;

class KataD {
    public static Map<Character, Integer> count(String str) {

        var counter = new HashMap<Character, Integer>();

        str.chars().mapToObj(ch -> (char) ch).forEach(ch -> counter.merge(ch, 1, Integer::sum));

        return counter;
    }
}
