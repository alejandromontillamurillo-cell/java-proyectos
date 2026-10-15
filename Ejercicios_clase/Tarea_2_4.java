package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_2_4 {
    public static void main(String[] args) {
        System.out.println("----------TAREA 4----------");
        
        int metros;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los metros:");
        metros = sc.nextInt();
        
        double millas = metros / 1609.34; 
        
        System.out.println("El resultado es: " + millas + " millas");
        
    }
}
