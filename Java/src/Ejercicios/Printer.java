package Ejercicios;

class Printer {

    public static String printerError(String s) {
        // your code
        s = s.toLowerCase();

        var errors = s.chars().filter(intCh -> intCh < (int) 'a' || intCh > (int) 'm').count();
        return errors + "/" + s.length();
    }
}
