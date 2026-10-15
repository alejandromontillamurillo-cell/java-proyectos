package martes;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        int base;
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triangulo en cm:");
        base = sc.nextInt();

        System.out.println("Introduce la altura del triangulo en cm:");
        altura = sc.nextInt();

        double area = (double) (base * altura) / 2;

        System.out.println("¿Como te llamas?");
        String nombre = sc.next(); 

        System.out.println(nombre.toUpperCase() + " el area del triangulo son: " + area + " cm2");
        
    }
}
