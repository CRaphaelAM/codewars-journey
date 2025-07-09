package Ejercicios;

/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side
of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty
or there is no DNA at all (again, except for Haskell).
*/
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
