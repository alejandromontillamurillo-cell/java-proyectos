package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_3_2 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu año de nacimiento: ");
		short nacimiento = teclado.nextShort();

		System.out.print("Introduce el año actual: ");
		short actual = teclado.nextShort();
	
		short edad = (short) (actual - nacimiento);

		System.out.println("Tu edad es: " + edad);
	}
}
