
package martes;

import java.util.Scanner;

 class Practica8_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int minimo, maximo, numero;

        System.out.println("Introduce el valor minimo del rango:");
        minimo = teclado.nextInt();

        System.out.println("Introduce el valor maximo del rango:");
        maximo = teclado.nextInt();

        System.out.println("Introduce un numero entre " + minimo + " y " + maximo + ":");
        numero = teclado.nextInt();

        while (numero <  minimo || numero > maximo) {

            System.out.println("El numero esta fuera del rango. Intentalo de nuevo:");
            numero = teclado.nextInt();

        }

        System.out.println("Correcto. El numero esta dentro del rango: " + numero);

        teclado.close();
    }
}

