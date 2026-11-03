package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\nLa nota media es: %.2f\n", media);

        if (media < 0 || media > 10) {
            System.out.println("Error: Las notas deben estar entre 0 y 10.");
        } else if (media < 5) {
            System.out.println("Calificación: INSUFICIENTE");
        } else if (media < 6) {
            System.out.println("Calificación: SUFICIENTE");
        } else if (media < 7) {
            System.out.println("Calificación: BIEN");
        } else if (media < 9) {
            System.out.println("Calificación: NOTABLE");
        } else {
            System.out.println("Calificación: SOBRESALIENTE");
        }

        scanner.close();
    }
}
