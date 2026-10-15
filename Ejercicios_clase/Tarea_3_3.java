package Ejercicios_clase;

import java.util.Scanner;

public class Tarea_3_3 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		double num1 = teclado.nextDouble();

		System.out.print("Introduce el segundo número: ");
		double num2 = teclado.nextDouble();

		double division = num1 / num2;

		System.out.println("La división es: " + division);
	}
}