package Java;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mes;

        System.out.print("Ingresé número de mes: ");
        mes = scanner.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero - Verano");
                break;
            case 2:
                System.out.println("Febrero - Verano");
                break;
            case 3:
                System.out.println("Marzo - Verano / Otoño");
                break;
            case 4:
                System.out.println("Abril - Otoño");
                break;
            case 5:
                System.out.println("Mayo - Otoño");
                break;
            case 6:
                System.out.println("Junio - Otoño / Invierno");
                break;
            case 7:
                System.out.println("Julio - Invierno");
                break;
            case 8:
                System.out.println("Agosto - Invierno");
                break;
            case 9:
                System.out.println("Septiembre - Invierno / Primavera");
                break;
            case 10:
                System.out.println("Octubre - Primavera");
                break;
            case 11:
                System.out.println("Noviembre - Primavera");
                break;
            case 12:
                System.out.println("Diciembre - Primavera / Verano");
                break;
            default:
                System.out.println("Mes no existe.");
                break;
        }
    }
}
