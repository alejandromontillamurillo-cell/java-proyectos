package martes;

import java.util.Scanner;

public class Practica_8_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la altura de la pirámide (n): ");
        int n = teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
        	
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        
        teclado.close();
    }
    }
}