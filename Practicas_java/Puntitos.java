package martes;

import java.util.Scanner;

public class Puntitos {
    public static void main(String[] args) {
        int alto;
        int ancho;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el alto:");
        alto = sc.nextInt();
        
        System.out.println("Introduce el ancho:");
        ancho = sc.nextInt();
        
        for (int i = 0; i <= alto; i++) {
            System.out.println();
            
            // --- LETRA P ---
            for (int j = 0; j <= ancho; j++) {
                if (j == 0 || i == 0 || i == alto / 2 || (j == ancho && i < alto / 2)) {
                    System.out.print("P ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            // --- LETRA E ---
            for (int j = 0; j <= ancho; j++) {
                if (i == 0 || j == 0 || i == alto || (i == alto / 2 && j <= ancho / 2)) {
                    System.out.print("E ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // --- LETRA P ---
            for (int j = 0; j <= ancho; j++) {
                if (j == 0 || i == 0 || i == alto / 2 || (j == ancho && i < alto / 2)) {
                    System.out.print("P ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // --- LETRA E ---
            for (int j = 0; j <= ancho; j++) {
                if (i == 0 || j == 0 || i == alto || (i == alto / 2 && j <= ancho / 2)) {
                    System.out.print("E ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println(); 
    }
}
