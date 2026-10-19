package martes;

import java.util.Scanner;

public class Practica_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        char letra = teclado.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal ");
                break;
        }
    }
}

