package martes;

import java.util.Scanner;

public class Practica_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero = 1; 
        int totalNumeros = 0;
        int suma = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce números enteros (introduce 0 para terminar):");

        while (numero != 0) {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            if (numero != 0) {
                totalNumeros++;
                suma += numero;

                if (numero > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total de números introducidos: " + totalNumeros);
        System.out.println("Suma de todos los números: " + suma);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        
        teclado.close();
    }
}

