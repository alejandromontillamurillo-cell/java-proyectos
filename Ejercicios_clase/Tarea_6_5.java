package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_5 {

    public static void main(String[] args) {
    	
    	double a;
    	double b;
    	double x;
    	
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        
        System.out.print("Por favor, introduzca el valor de a: ");
        a = teclado.nextDouble();
        
        System.out.print("Ahora introduzca el valor de b: ");
        b = teclado.nextDouble();

        if (a == 0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
