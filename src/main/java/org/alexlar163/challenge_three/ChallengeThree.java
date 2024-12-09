/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

package org.alexlar163.challenge_three;

import java.util.Arrays;

public class ChallengeThree {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 0; i <= 50; i++) {
            System.out.print(firstNumber + ",");
            firstNumber = secondNumber;
            secondNumber = firstNumber+secondNumber;
        }

    }
}
