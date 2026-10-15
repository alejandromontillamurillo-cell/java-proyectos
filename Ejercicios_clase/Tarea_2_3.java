package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_2_3 {
	 public static void main(String[] args) {
		
		System.out.println("------------TAREA 3-------------");
		
			int primerNumero1;
	     	int primerNumero2;
	     	
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un numero:");
	        primerNumero1 = sc.nextInt();

	        System.out.println("Introduce un numero:");
	        primerNumero2 = sc.nextInt();

	        double resultado = (double) primerNumero1 / primerNumero2;
	        System.out.println("El resultado es:"+resultado);
	        
	 }
}