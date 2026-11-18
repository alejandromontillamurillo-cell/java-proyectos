package Practicas_java;

import java.util.Scanner;

class NoValidaException extends Exception {
    public NoValidaException(String mensaje) {
        super(mensaje);
    }
}

public class Palindromo2 {
    public static void main(String[] args) {
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
            
            // 2. Limpiamos espacios y pasamos a minúsculas
            String limpia = cad1.replace(" ", "").toLowerCase();
            
            // 3. Invertimos la frase limpia recorriéndola de atrás hacia adelante
            String invertida = "";
            for (int j = limpia.length() - 1; j >= 0; j--) {
                invertida += limpia.charAt(j);
            }
            
            // 4. Comparamos usando .equals() (nunca con == para Strings)
            if (limpia.equals(invertida)) {
                System.out.println("¡Es un palíndromo!");
            } else {
                System.out.println("No es un palíndromo.");
            }
            
        } catch (NoValidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
