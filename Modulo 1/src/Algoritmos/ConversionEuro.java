package Algoritmos;

import java.util.Scanner;

public class ConversionEuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double euro;
        int opcion;
        String tipoMoneda;

        System.out.print("Ingresé cantidad de euros a convertir: ");
        euro = scanner.nextDouble();

        System.out.println("==== Conversor de divisa ====");
        System.out.println("| Opciones:                 |");
        System.out.println("|    1- Libra: 0.86         |");
        System.out.println("|    2- Dolar: 1.28611      |");
        System.out.println("|    3- Yen: 129.852        |");
        System.out.println("=============================");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                tipoMoneda = "Libra";
                Conversion(euro, tipoMoneda);
                break;
            case 2:
                tipoMoneda = "Dolar";
                Conversion(euro, tipoMoneda);
                break;
            case 3:
                tipoMoneda = "Yen";
                Conversion(euro, tipoMoneda);
                break;
            default:
                break;
        }
    }


    public static void Conversion(double euro, String tipoMoneda) {
        double conversion;
        if (tipoMoneda.equalsIgnoreCase("Libra")) {
            conversion = euro * 0.86;
        } else if (tipoMoneda.equalsIgnoreCase("Dolar")) {
            conversion = euro * 1.28611;
        } else {
            conversion = euro * 128.852;
        }
        System.out.printf("Su cambio fue de %.3f Euros a %.3f %s", euro, conversion, tipoMoneda);
    }
}
