/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

package org.alexlar163.challenge_one;

public class ChallengeOne {
    public static void main(String[] args) {
        String fizzWord = "fizz";
        String buzzWord = "buzz";

        System.out.println("Números del 1 al 100: ");

        for (int i = 1; i <= 100; i++) {
            String result = "Palabra: ";
            if (i % 3 == 0 && i % 5 ==0) {
                result = result.concat(fizzWord + buzzWord);
            } else if (i % 3 == 0) {
                result = result.concat(fizzWord);
            } else if (i % 5 == 0) {
                result = result.concat(buzzWord);
            } else {
                result = "Número: ";
                result = result.concat(String.valueOf(i));
            }

            System.out.println(result);
        }
    }
}
