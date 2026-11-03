package martes;

import java.util.Scanner;

public class Practica_8_b_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n;
        int a = 0;
        int b = 1;
        int i = 1;
        int actual;
        
        System.out.print("Introduce el número de términos (n): ");
        n = entrada.nextInt();
        
        for (i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            actual = a + b;
            a = b;
            b = actual;
        }
    }
}
