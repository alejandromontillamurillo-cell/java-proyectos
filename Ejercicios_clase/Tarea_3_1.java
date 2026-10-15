package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_3_1 {
	 public static void main(String[] args) {
		
		System.out.println("------------TAREA 1-------------");
		
			byte primerNumero1;
	     	byte primerNumero2;
	     	
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce un numero:");
	        primerNumero1 = sc.nextByte();

	        System.out.println("Introduce un numero:");
	        primerNumero2 = sc.nextByte();

	        double resultado = (double) primerNumero1 + primerNumero2;
	        System.out.println("El resultado es:"+resultado);
	        
	 }
}