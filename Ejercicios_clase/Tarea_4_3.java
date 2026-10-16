package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_4_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = teclado.nextDouble();

        int media = (int) ((nota1 + nota2 + nota3) / 3);

        System.out.println("La parte entera de la media es: " + media);
    }
}