package Ejercicios;

/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Ejercicios.Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Ejercicios.Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.
*/
public class KataC {
    public static double findUniq(double arr[]) {

        double candidate = arr[0] == arr[1] ? arr[0] : arr[2];

        for (int i = 1; i < arr.length; i++) {
            if (candidate != arr[i]) {
                candidate = arr[i];
                break;
            }
        }
        return candidate;
    }
}
