package Practicas_java;

import java.util.Scanner;

public class contador_palabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String cad1 = sc.nextLine();

        if (cad1 != null && !cad1.trim().isEmpty()) {
            // Pasamos a minúsculas y dividimos por espacios
            String[] palabras = cad1.trim().toLowerCase().split("\\s+");

            String palabraMasRepetida = "";
            int maxRepeticiones = 0;

            for (int i = 0; i < palabras.length; i++) {
                int contador = 0;

                for (int j = 0; j < palabras.length; j++) {
                    if (palabras[i].equals(palabras[j])) {
                        contador++;
                    }
                }

                if (contador > maxRepeticiones) {
                    maxRepeticiones = contador;
                    palabraMasRepetida = palabras[i];
                }
            }

            System.out.println("La palabra que más se repite es: \"" + palabraMasRepetida + "\" (" + maxRepeticiones + " veces).");
        } else {
            System.out.println("No has introducido ninguna frase.");
        }

        sc.close();
    }
}
