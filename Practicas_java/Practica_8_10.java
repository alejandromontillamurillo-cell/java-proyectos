package martes;

import java.util.Scanner;

public class Practica_8_10 {
    public static void main(String[] args) {
        int numero;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre 0 y 10: ");
        numero = sc.nextInt();

        while (numero < 0 || numero > 10) {
            System.out.println("Maximo el numero 10 (y minimo 0)");
            System.out.print("Introduce un numero entre 0 y 10: ");
            numero = sc.nextInt();
        }

        int i = 1;
        while (i <= 10) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }

        sc.close();
    }
}