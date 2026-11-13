package Practicas_java;

import java.util.Scanner;

public class Maquina_exprendedora{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double Precio = teclado.nextDouble(); //precio en minuscula

        double totalIntroducido = 0;
        int cntmoneda = 0; //monedas y indicar q son las de cantida

        while (totalIntroducido < Precio) {// menor estricto

            System.out.print("Introduce una moneda: ");
            double moneda = teclado.nextDouble();
            if (cntmoneda > 0) { // el if tiene que estar con los parametros que cambian dentro
            	cntmoneda--;

            totalIntroducido = cntmoneda;

                System.out.println("Moneda aceptada");
            }else{
                System.out.println("Moneda no aceptada");
            }
        }

        double cambio = totalIntroducido - Precio;// quitamos el casting de int

        if (cambio > 0) // quitamos el ;
        {
            System.out.println("Cambio a devolver: " + cambio);
        }

        System.out.println("Número de monedas: " + cntmoneda);

        teclado.close();
    }
}