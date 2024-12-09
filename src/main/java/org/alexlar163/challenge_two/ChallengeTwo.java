/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

package org.alexlar163.challenge_two;

import java.util.Arrays;

public class ChallengeTwo {
    public static void main(String[] args) {
        String wordOne = "mona";
        String wordTwo = "mano";

        boolean result = getAnagram(wordOne, wordTwo);
        System.out.println("result: " + result);
    }

    public static boolean getAnagram(String  wordOne, String wordTwo) {
        char[] wordOneArray = wordOne.toCharArray();
        Arrays.sort(wordOneArray);

        char[] wordTwoArray = wordTwo.toCharArray();
        Arrays.sort(wordTwoArray);

        return Arrays.equals(wordOneArray, wordTwoArray);
    }


}
