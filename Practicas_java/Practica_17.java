package martes; 

import java.util.Scanner; 

public class Practica_17 { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        int numero; 
        int primeracifra; 
        
        System.out.println("Introduce un numero, minimo de dos cifras: "); 
        numero = teclado.nextInt(); 
           
        while (numero >= 10) { 
            numero /= 10; 
        } 
        
        primeracifra = numero; 
        
        if (numero >= 0) { 
            System.out.println("La primera cifra de tu numero es: " + primeracifra); 
        } else { 
            System.out.println("Introduces un numero negativo. Su primera cifra es: " + primeracifra); 
        } 
        
        teclado.close(); 
    } 
}
