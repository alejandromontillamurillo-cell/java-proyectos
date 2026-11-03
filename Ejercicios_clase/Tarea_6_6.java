package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Introduce la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        nota3 = scanner.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las tres notas es: " + promedio);

        scanner.close();
    }
}
