package Practicas_java;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String cad1 = scanner.next();

        System.out.print("Introduce la segunda palabra: ");
        String cad2 = scanner.next();

        if (cad1.length() < cad2.length()) {
            System.out.println("La palabra más corta es: " + cad1);
        } else if (cad2.length() < cad1.length()) {
            System.out.println("La palabra más corta es: " + cad2);
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }

        scanner.close();
    }
}
