package Ejercicios;

import java.util.HashMap;
import java.util.Map;

/*
You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early
to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens
with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter
strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each
letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will
 return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!)
 and will, of course, return you to your starting point. Return false otherwise.
 */

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;


        Map<String, Long> movement = new HashMap<>();
        movement.put("n", 0L);
        movement.put("s", 0L);
        movement.put("e", 0L);
        movement.put("w", 0L);

        for (char position : walk) {
            String posStr = String.valueOf(position);
            if (movement.containsKey(posStr))
                movement.merge(posStr, 1L, Long::sum);
        }


        return (movement.get("n") - movement.get("s")) == 0 && (movement.get("e") - movement.get("w") == 0);
    }
}
