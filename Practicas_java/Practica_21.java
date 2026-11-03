package martes;

import java.util.Scanner;

public class Practica_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para almacenar los datos ingresados
        int cargo, diasViaje, estadoCivil;
        
        // Variables para los cálculos económicos
        double sueldoBase = 0;
        double dietas = 0;
        double sueldoBruto = 0;
        double irpfPorcentaje = 0;
        double retencionIRPF = 0;
        double sueldoNeto = 0;

        // 1. Preguntar el cargo del empleado
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        cargo = sc.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        diasViaje = sc.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = sc.nextInt();
        
        // Asignar sueldo base según el cargo
        switch (cargo) {
            case 1:
                sueldoBase = 950.00;
                break;
            case 2:
                sueldoBase = 1200.00;
                break;
            case 3:
                sueldoBase = 1600.00;
                break;
            default:
                System.out.println("Cargo incorrecto. Fin del programa.");
                sc.close();
                return;
        }


        dietas = diasViaje * 30.00; // 30 euros por día de viaje
        sueldoBruto = sueldoBase + dietas;


        // Asignar el porcentaje de IRPF según estado civil
        if (estadoCivil == 1) {
            irpfPorcentaje = 25.00;
        } else if (estadoCivil == 2) {
            irpfPorcentaje = 20.00;
        } else {
            System.out.println("Estado civil incorrecto. Fin del programa.");
            sc.close();
            return;
        }

        // 4. Realizar los cálculos finales
        retencionIRPF = sueldoBruto * (irpfPorcentaje / 100.00);
        sueldoNeto = sueldoBruto - retencionIRPF;

        // 5. Imprimir la nómina desglosada con formato numérico de dos decimales
        System.out.println("\n----------------------------------");
        System.out.printf("| Sueldo base             %.2f |\n", sueldoBase);
        System.out.printf("| Dietas (%2d viajes)       %.2f |\n", diasViaje, dietas);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo bruto            %.2f |\n", sueldoBruto);
        System.out.printf("| Retención IRPF (%.0f%%)     %.2f |\n", irpfPorcentaje, retencionIRPF);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo neto             %.2f |\n", sueldoNeto);
        System.out.println("---------------------------------");

        sc.close();
    }
}
