package martes;

import java.util.Scanner;

public class Practica_8_b_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n;
        int alrreves= 0;
        int ultimoDigito;
        
        System.out.print("Introduce un numero : ");
        n = entrada.nextInt();
        
        while (n >0) {
            
            ultimoDigito = n %(10);
            alrreves= (alrreves*10)+ ultimoDigito;
            n= n/10;
            
        }
        System.out.println("El numero al reves es: " + alrreves);
    }
}
