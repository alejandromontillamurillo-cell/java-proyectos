package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_2_5{
    public static void main(String[] args) {
        System.out.println("----------TAREA 4----------");
        
        int gradosCentigrados;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los grados °C:");
        gradosCentigrados = sc.nextInt();
        
        double resultado = (gradosCentigrados * 1.8) +32; 
        
        System.out.println("El resultado son: " + resultado + " °F");
        
    }
}
