package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 != 0) {
            System.out.println("El número es impar");
        } else {
            System.out.println("El número no es impar");
        }
    }
}