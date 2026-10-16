package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        long numero1 = teclado.nextLong();

        System.out.print("Introduce el segundo número: ");
        long numero2 = teclado.nextLong();

        System.out.print("Introduce el tercer número: ");
        long numero3 = teclado.nextLong();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero3);
        }
    }
}