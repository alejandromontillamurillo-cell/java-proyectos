package Practicas_java;

import java.util.Scanner;

class NoValidaExceptio extends Exception{
	public NoValidaExceptio(String mensaje) {
		super(mensaje);
		
	}
}
public class Palindromo {
	public static void main(String[]args ) throws NoValidaExceptio {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a mi palindromo.");
		System.out.println("Escribe una frase: ");
		String cad1 = sc.nextLine();
		
		try {
            // 1. Validamos que la frase no tenga números
            for (int i = 0; i < cad1.length(); i++) {
                if (Character.isDigit(cad1.charAt(i))) {
                    throw new NoValidaException("La frase no puede tener números.");
                }
            }
		}
	}
}


