package martes;

import java.util.Scanner;

public class Practica_3 {

    public static void main(String[] args) {
        
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
            
            if (i % 2 != 0) {
                System.out.print(" - impar");
                contadorImpares++; 
            } else {
                System.out.print(" - par");
                contadorPares++; 
            }
            
            System.out.println();
        }
        
        System.out.println("\nTotal de números impares: " + contadorImpares);
        System.out.println("Total de números pares: " + contadorPares);
        
        sc.close(); 
    }
}
