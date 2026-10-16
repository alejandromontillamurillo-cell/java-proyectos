package Ejercicios_clase;

import java.util.Scanner;

public class Tarera_4_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();

        System.out.print("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("La media es: " + media);
    }
}