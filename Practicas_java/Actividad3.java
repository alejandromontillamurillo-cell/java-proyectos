import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        int longitud = frase.length();

        if (longitud == 0) {
            System.out.println("La frase está vacía.");
        } else {
            int posicionCentral = longitud / 2;
            char caracterCentral = frase.charAt(posicionCentral);

            System.out.println("El carácter en la posición central (" + posicionCentral + ") es: '" + caracterCentral + "'");

            if (caracterCentral == ' ') {
                System.out.println("El carácter central SÍ es un espacio.");
            } else {
                System.out.println("El carácter central NO es un espacio.");
            }
        }

        scanner.close();
    }
}
