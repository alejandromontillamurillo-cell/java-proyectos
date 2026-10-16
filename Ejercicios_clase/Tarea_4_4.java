package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_4_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numero = teclado.nextDouble();

        int redondeado = (int) Math.round(numero);

        System.out.println("Número redondeado: " + redondeado);
    }
}