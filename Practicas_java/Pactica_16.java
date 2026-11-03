package martes;

import java.util.Scanner;

public class Pactica_16 {
		public static void main(String[]args) {
			Scanner teclado=new Scanner(System.in);
			
			int numero;
			int ultimacifra;
			
			System.out.println("Introduce un numero, minimo de dos cifras: ");
			numero=teclado.nextInt();
			
			ultimacifra = numero % 10;
			
			if(numero>=0) {
				System.out.println("La ultima cifra de tu numero es: " +ultimacifra );
			}				
		}			
	}