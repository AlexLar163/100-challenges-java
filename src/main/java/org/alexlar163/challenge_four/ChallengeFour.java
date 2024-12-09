/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

package org.alexlar163.challenge_four;

public class ChallengeFour {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            String result = isPrimo(i) ? "Es primo" : "No es primo";



            System.out.println(i + ": " + result);
        }
    }
    public static boolean isPrimo(int i) {
        if (i % 2 == 0 && i != 2) return false;
        if (i % 3 == 0 && i != 3) return false;
        if (i % 5 == 0 && i != 5) return false;
        if (i % 7 == 0 && i != 7) return false;
        if (i % 11 == 0 && i != 11) return false;

        return true;
    }
}
