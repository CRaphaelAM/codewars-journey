package Ejercicios;

import java.util.List;
import java.util.stream.Collectors;

/*
Make a program that filters a list of strings and returns a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...
*/
class Kata {
    public static List<String> friend(List<String> x) {
        // Your code here
        final int FRIEND_LENGHT = 4;
        return x.stream().filter(str -> str.length() == FRIEND_LENGHT).collect(Collectors.toList());
    }
}
