package Practicas_java;

import java.util.Scanner;

public class Actividad_cadena_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Alabí Alixar");
		final int chicarrones=5000;
		
		System.out.println("El StringBuilder es: " +sb);
		
		 System.out.println("Capacidad: " + sb.capacity());
	     System.out.println("Longitud: " + sb.length());
	     System.out.println(sb.replace(0,12,"Hay " +chicarrones+ " Chicharrones"));
	     System.out.println(sb.replace(0, sb.length(), "Hay " +chicarrones+ " Chicharrones en Chiclana"));
	    
	     String sb2 = sb.substring(sb.length()-4);
	     System.out.println(sb2);
	     System.out.println("Capacidad final : " + sb.capacity());
	     System.out.println("Longitud final : " + sb.length());
	}
}
