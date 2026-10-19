package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_6_4 {

    public static void main(String[] args) {
    	
    	int horasExtras;
    	int sueldoSemanal;
    	int horasTrabajadas;
    	
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        horasTrabajadas = teclado.nextInt();

        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * 12;
        } else {
            horasExtras = horasTrabajadas - 40;
            sueldoSemanal = (40 * 12) + (horasExtras * 16);
        }

        System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
    }
}
