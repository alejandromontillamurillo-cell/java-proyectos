package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número no es positivo");
        }
    }
}