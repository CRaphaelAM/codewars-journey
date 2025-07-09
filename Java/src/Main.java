import Ejercicios.Solution;

/*
Make a program that filters a list of strings and returns a list with only your friends name in it.

If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...
*/


/*
In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which,
 for the sake of simplicity, are named with letters from a to m.

The colors used by the printer are recorded in a control string. For example a "good" control string would be
 aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...

Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced
e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.

You have to write a function printer_error which given a string will return the error rate of the printer as a string
representing a rational whose numerator is the number of errors and the denominator the length of the control string.
Don't reduce this fraction to a simpler expression.

The string has a length greater or equal to one and contains only letters from ato z.
*/

/*
Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built
 with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
 */


/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z
at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */


/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side
of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty
or there is no DNA at all (again, except for Haskell).
*/


/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

*/


/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Ejercicios.Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Ejercicios.Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.
*/


/*
You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early
to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens
with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter
strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each
letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will
 return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!)
 and will, of course, return you to your starting point. Return false otherwise.
 */


/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
 */

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position
 the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive
numbers.
*/



/*
The main idea is to count all the occurring characters in a string. If you have a string like aba,
then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.

*/


/*
Complete the solution so that the function will break up camel casing, using a space between words.
*/

/*
The goal of this exercise is to convert a string to a new string where each character in the new string
is "(" if that character appears only once in the original string, or ")" if that character appears more
than once in the original string. Ignore capitalization when determining if a character is a duplicate.
*/



public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.camelCase("a"));
    }
}