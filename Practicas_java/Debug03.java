package Practicas_java;

import java.util.Scanner;

public class Debug03 {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }

        sc.close(); // Cerramos el Scanner.
    }

    public static boolean esPrimo(int num) {

        boolean esPrimo = true; // Suponemos inicialmente que es primo.

        if (num < 2) { // Los números menores que 2 no son primos.
            esPrimo = false;
        }

        for (int i = 2; i < num; i++) { // Comprobamos los posibles divisores.

            if (num % i == 0) { // Si el resto es 0, el número es divisible.
                esPrimo = false;
                break; // Salimos del bucle porque ya sabemos que no es primo.
            }
        }

        return esPrimo; // Devolvemos si el número es primo o no.
    }
}

