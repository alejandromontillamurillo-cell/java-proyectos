package martes;

import java.util.Scanner;

public class Practica {
	public static void main(String[]args) {
		
		int edad;
		int descanso;
		String nombre;
		final int DIAS_SEMANA=7;
		
		Scanner teclado=new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Hola, " +nombre);
		
		System.out.println("Dime tu edad: ");
		edad=teclado.nextInt();
		System.out.println("Tienes " +edad+ " años.");
		
		
		System.out.println("Cuantas horas duermes al dia: ");
		descanso=teclado.nextInt();
		System.out.println("Duermes aproximadamente " +descanso*DIAS_SEMANA+ " horas a la semana");
		
		if (edad >= 18) {
		    System.out.println("Ya eres mayor de edad.");
		} 
		
		else {
		    System.out.println("Te quedan " + (18 - edad) + " años para ser mayor de edad.");
		}
	}
}