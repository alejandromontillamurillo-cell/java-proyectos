package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int hora;
        
        System.out.print("Introduce una hoar del dia: ");
        hora = teclado.nextInt();
        
        if (hora >= 6 && hora <= 12) {
            System.out.println("buenos días");
        } 
        if (hora >= 13 && hora <= 20) {
            System.out.println("buenas tardes");
        } 
        if (hora >= 1 && hora <= 5) {
            System.out.println("buenas noches");
        } 
        if (hora >= 21 && hora <= 23) {
            System.out.println("buenas noches");
        } 
    }
}