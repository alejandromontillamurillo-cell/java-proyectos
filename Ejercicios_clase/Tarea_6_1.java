package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un dia de la semana (en minusculas): ");
        String dia = teclado.next();
        
        if (dia.equals("lunes")) {
            System.out.println("A primera hora tienes: Matemáticas");
        } 
        else if (dia.equals("martes")) {
            System.out.println("A primera hora tienes: Historia");
        } 
        else if (dia.equals("miercoles")) {
            System.out.println("A primera hora tienes: Lengua");
        } 
        else if (dia.equals("jueves")) {
            System.out.println("A primera hora tienes: Inglés");
        } 
        else if (dia.equals("viernes")) {
            System.out.println("A primera hora tienes: Programación");
        } 
        else {
            System.out.println("Día no válido o no está en minúsculas.");
        }
        
        teclado.close();
    }
}
