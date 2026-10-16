package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_5_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double gravedad = 9.8;

        System.out.print("Introduce el tiempo: ");
        double tiempo = teclado.nextDouble();

        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto");
        } else {
            double velocidad = gravedad * tiempo;
            System.out.println("La velocidad es: " + velocidad);
        }
    }
}