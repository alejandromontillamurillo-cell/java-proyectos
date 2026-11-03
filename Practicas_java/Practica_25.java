package martes;

import java.util.Scanner;

public class Practica_25 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioComida = 0.0f;
        float precioBebida = 0.0f;
        boolean continuar=true;

        if (continuar) {

        	System.out.println("¿Qué has tomado de comer? (palmera, donut, pitufo)");
            String comida = sc.nextLine().toLowerCase();

        	if (comida.equals("palmera")) {
        		precioComida = 1.40f;
        	} else if (comida.equals("donut")) {
        		precioBebida = 1.00f;
        	} 
        	else if (comida.equals("pitufo")) {
        		System.out.println("¿con aceite o con tortilla?");
        		comida= sc.nextLine();
        		if (comida.equals("aceite")) {
        			precioComida = 1.20f;
        		}
        		if (comida.equals("tortilla")) {
        			precioComida = 1.60f;
        		}
        	}else {
        		System.out.println("Opción de comida no válida.");
        		continuar=false;
         
        	}
        }
        if (continuar) {

        	System.out.println("¿Qué has tomado de bebida? (zumo, café)");
        	String bebida = sc.nextLine().toLowerCase();

        	if (bebida.equals("zumo")) {
        		precioBebida = 1.50f;
        	} else if (bebida.equals("café")) {
        		precioBebida = 1.20f;
        	} else {
        		System.out.println("Opción de bebida no válida.");
        		continuar=false;
         
        	}
        }

        if (continuar) {
        float total = precioComida + precioBebida;
        System.out.printf("El precio total del desayuno es: "+ total +" euros");
        }
    }
}
