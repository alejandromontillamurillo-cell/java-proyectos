package martes;

import java.util.Scanner;

public class Practica_8_b_9 {
    public static void main(String[] args) {
        int alto;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el alto de la L:");
        alto = sc.nextInt();
               
        for (int i = 0; i <= alto; i++) {
            System.out.println();
            
            // --- LETRA P ---
            for (int j = 0; j <= alto; j++) {
                if (j == 0 || i == 0 || i == alto / 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
        }
        System.out.println(); 
    } 
}
