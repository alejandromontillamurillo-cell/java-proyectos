package martes;

import java.util.Scanner;

public class Practica_7 {
    public static void main(String[] args) {

    	        Scanner teclado = new Scanner(System.in);
    	        
    	        double totalHucha = 0;
    	        final double LIMITE_HUCHA = 200;
    	        double cantidadIntroducida;

    	        while (totalHucha < LIMITE_HUCHA) {
    	            System.out.print("¿Cuánto dinero quieres meter?: ");
    	            cantidadIntroducida = teclado.nextDouble();
    	            totalHucha += cantidadIntroducida;
    	            
    	            if (cantidadIntroducida == 0) {
    	                break;
    	            }            
    	        }    	        
    	        	System.out.println("--- PROGRAMA FINALIZADO ---");
    	        	if (totalHucha >= LIMITE_HUCHA) {}     
  }
}