package Practicas_java;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienbenido al contador de espacios.");
        System.out.print("Introduce una frase: ");
        String cad1 = sc.nextLine();
        int contador = 0;
       
        if(cad1!=null) {
        	for(int i=0; i < cad1.length(); i++) {
        		if(cad1.charAt(i) == ' ' ) {
        			contador++;
        			
        		}
        	}
        	System.out.println("La cadena tiene " +contador+ " espacios.");
        }
	}
}