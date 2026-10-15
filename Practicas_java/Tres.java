package martes;

import java.util.Scanner;

public class Tres {
	public static void main(String[]args) {
		
		int primerNumero;
		int segundoNumero;
		int suma;
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Introduce un numero por teclado:");
		primerNumero=teclado.nextInt();
		System.out.println("Elnumero introducido es:"+primerNumero);
		
		
		System.out.println("Introduce un numero por teclado:");
		segundoNumero=teclado.nextInt();
		System.out.println("Elnumero introducido es:"+segundoNumero);
		
		suma=primerNumero+segundoNumero;
		System.out.println("El resultado es:"+suma);
		
		if (primerNumero>segundoNumero)
			System.out.println("El primero es mayor");
		else if (primerNumero<segundoNumero)
				System.out.println("El segundo es mayor");
			else
				System.out.println("Son iguales");
	}
}
