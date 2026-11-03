package martes;

import java.util.Scanner;

public class Practica_8_b_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int clave = 1234;
        boolean abresCaja = false;
        int intentos = 1;

        System.out.println("¡Bienvenido! Introduce la clave para abrir la caja fuerte");
        System.out.println();

        while (intentos <= 4 && !abresCaja) {
            System.out.print("Intento " + intentos + " |  -Escribe un numero: ");
            int intentoUsuario = teclado.nextInt();
            System.out.println();

            if (intentoUsuario < 1000 || intentoUsuario > 9999) {
                System.out.println("La clave debe de tener 4 cifras");
                System.out.println();

            } 

            else if (intentoUsuario == clave) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                abresCaja = true;
                System.out.println();
            } 

            else {
                System.out.println("Lo siento, esa no es la combinacion.");
                intentos++;
                System.out.println();
            }
        }


        if (!abresCaja) {
            System.out.println("Se te acabaron los intentos.");
        }

        teclado.close();
    }
}

