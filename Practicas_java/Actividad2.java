package Practicas_java;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder fraseCompleta = new StringBuilder();

        System.out.println("Introduce las palabras (escribe 'fin' para terminar):");

        while (true) {
            String palabra = scanner.next();

            // Comprueba si la palabra es "fin" ignorando mayúsculas y minúsculas
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }

            if (fraseCompleta.length() > 0) {
                fraseCompleta.append(" ");
            }
            fraseCompleta.append(palabra);
        }

        System.out.println("Frase resultante:");
        System.out.println(fraseCompleta.toString());

        scanner.close();
    }
}
