package martes;

import java.util.Scanner;

public class Practica_2 {
	public static void main(String[]args) {
		
		double nota;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una nota entre 0 y 10: ");
		nota= sc.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Nota incorrecta");	
		} 
		
		 else if (nota < 5) 
			System.out.println("Suspenso");
		 else if (nota < 6)  
			System.out.println("Aprobado");
		 else if (nota < 7)  
			System.out.println("Bien");
		 else if (nota < 9)  
			System.out.println("Notable");
		
		 else { 
			System.out.println("Sobresaliente");
		}
	}
}



