package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_3_4 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Introduce las millas: ");
		float millas = teclado.nextFloat();

		float kilometros = millas * 1.609f;

		System.out.println("Son " + kilometros + " kilómetros.");
	}
}