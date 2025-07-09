package Ejercicios;

/*
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number
of characters then it should replace the missing second character of the final pair with an underscore ('_').
*/
class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] strArr = new String[s.length() / 2];
        int pos = 0;
        for (int i = 0; i < s.length(); i += 2) {
            strArr[pos] = s.substring(i, i + 2);
            pos++;
        }

        return strArr;
    }
}
