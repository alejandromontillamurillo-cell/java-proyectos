package Practicas_java;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al eliminador de vocales.");
		System.out.print("Introduce una frase: ");
		String cad1 = sc.nextLine();
		String resultado = "";
		String vocales = "aeiouAEIOU";
		
		if(cad1 != null) {
			for(int j = 0; j < cad1.length(); j++) {
				char letra = cad1.charAt(j);

				
				if(vocales.indexOf(letra) == -1) {
					resultado = resultado + letra;
				}
			}
			System.out.println(resultado);
		}
	}
}
