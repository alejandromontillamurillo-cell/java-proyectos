package Practicas_java;

import java.util.Scanner;

public class Debug02 {

    public static void main(String[] args) {

        int i, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores " + num);
        i = num; // Inicializamos el contador con el número introducido.

        while (i < num + 10) { // Menor que: repetimos hasta llegar a los 10 números.

            System.out.println("Número posterior " + i);
            i++; // Aumentamos el contador en uno.
        }

        sc.close(); 
    }
}

