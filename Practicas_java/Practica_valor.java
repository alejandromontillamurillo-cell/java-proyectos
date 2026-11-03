package martes; 

import java.util.Scanner; 

public class Practica_valor { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 

        int a = 5;
        int b = 7;
        int temporal = a; 

        a = b; 

        b = temporal; 

        System.out.println("a: " + a); 
        System.out.println("b: " + b); 

        	
}
}