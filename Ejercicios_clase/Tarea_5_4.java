package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        int pares = 0;

        if (numero1 % 2 == 0) {
            pares++;
        }

        if (numero2 % 2 == 0) {
            pares++;
        }

        System.out.println("Cantidad de números pares: " + pares);
    }
}