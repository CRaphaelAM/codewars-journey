package Ejercicios;

import java.util.HashMap;
import java.util.Map;

class TenMinWalk {
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
