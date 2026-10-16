package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número 12: ");
        int numero = teclado.nextInt();

        if (numero == 12) {
            System.out.println("Lo has hecho correctamente");
        } else {
            System.out.println("No lo has hecho correctamente");
        }
    }
}