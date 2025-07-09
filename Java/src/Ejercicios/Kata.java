package Ejercicios;

import java.util.List;
import java.util.stream.Collectors;

class Kata {
    public static List<String> friend(List<String> x) {
        // Your code here
        final int FRIEND_LENGHT = 4;
        return x.stream().filter(str -> str.length() == FRIEND_LENGHT).collect(Collectors.toList());
    }
}
