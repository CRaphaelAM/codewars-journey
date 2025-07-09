package Ejercicios;

class KataC {
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
