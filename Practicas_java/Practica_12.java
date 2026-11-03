package martes; 

import java.util.Scanner; 

public class Practica_12 { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        
        int a;
        int b;
        int c;
        int mayor=0;
        int mediano=0;
        int menor=0;
        
        System.out.println("Dime un numero: ");
        a= teclado.nextInt();
        System.out.println("Dime un numero: ");
        b= teclado.nextInt();
        System.out.println("Dime un numero: ");
        c= teclado.nextInt();
        
        mayor = (a > b && a > c) ? a : (b > c ? b : c);
        menor = (a < b && a < c) ? a : (b < c ? b : c);
        mediano = (a + b + c) - mayor - menor;

        
        System.out.println("El numero mayor es: " +mayor);
        System.out.println("El numero mediano es: " +mediano);
        System.out.println("El numero menor es: " +menor);
 }
}
