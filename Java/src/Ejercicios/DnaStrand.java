package Ejercicios;

public class DnaStrand {
    public static String makeComplement(String dna) {
        // A -> T
        // c -> G
        StringBuilder complement = new StringBuilder(dna.length());
        for (var ch : dna.toUpperCase().toCharArray()) {
            switch (ch) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
            }
        }
        return complement.toString();
    }
}
