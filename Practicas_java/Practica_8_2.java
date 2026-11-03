package martes;

import java.util.Scanner;

public class Practica_8_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int contadorAlumnos = 0;
        int contadorMayoresEdad = 0;

        System.out.print("Introduce la edad del alumno: ");
        int edad = scanner.nextInt();

        while (edad >= 0) {
            sumaEdades += edad;
            contadorAlumnos++;

            if (edad >= 18) {
                contadorMayoresEdad++;
            }

            System.out.print("Introduce la edad del alumno: ");
            edad = scanner.nextInt();
        }
        
        if (contadorAlumnos > 0) {
            double mediaEdades = (double) sumaEdades / contadorAlumnos;

            System.out.println("Suma total de las edades: " + sumaEdades);
            System.out.printf("Media de las edades: %.2f%n", mediaEdades);
            System.out.println("Total de alumnos introducidos: " + contadorAlumnos);
            System.out.println("Alumnos mayores de edad (>= 18): " + contadorMayoresEdad);
        } else {
            System.out.println("No se introdujo ninguna edad de alumno válida.");
        }

        scanner.close();
    }
}
