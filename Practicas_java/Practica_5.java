package martes;

import java.util.Random;

import java.util.Scanner;

public class Practica_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int numeroSecreto = random.nextInt(50) + 1; 
        boolean gano = false; 
        int intentos = 1;
        
        System.out.println("¡Bienvenido! Tienes 10 intentos para adivinar el número entre 1 y 50.");
        
        while (intentos <= 10 && !gano) {
            System.out.print("Intento #" + intentos + " - Escribe un numero: ");
            int intentoUsuario = teclado.nextInt();
            
            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Ganaste! Acertaste el número.");
                gano = true;
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El numero secreto es mas chico.");
                intentos++;
            } else {
                System.out.println("El numero secreto es mas grande.");
                intentos++; 
            }
        }
        
        if (!gano) {
            System.out.println("Te quedaste sin intentos. El número secreto era: " + numeroSecreto);
        }
        
        teclado.close();
    }
}

