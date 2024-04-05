package Algoritmos;

import java.util.Scanner;

public class Calculadora3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, opcion;

        System.out.println("Deberá ingresar 2 números para luego realizar un calculo.");

        System.out.print("Ingrese número 1: ");
        numero1 = scanner.nextInt();

        System.out.print("Ingrese número 2: ");
        numero2 = scanner.nextInt();

        System.out.println("¿Que desea hacer?");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.print("Ingrese opción (número): ");
        opcion = scanner.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    sumar(numero1, numero2);
                    break;
                case 2:
                    restar(numero1, numero2);
                    break;
                case 3:
                    multiplicar(numero1, numero2);
                    break;
                case 4:
                    dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opción invalida. Hasta luego");
            }
            System.out.println("Presione una tecla para continuar...");
            scanner.nextLine();
            scanner.nextLine();

            System.out.println("¿Desea realizar algo más con los números?");
            System.out.println();
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println();
            System.out.print("Ingrese opción (número): ");
            opcion = scanner.nextInt();
        }
        scanner.close();
    }

    public static void sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("*******************************");
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("*******************************");
    }

    public static void restar(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        System.out.println("*******************************");
        System.out.println("El resultado de la resta es: " + resultado);
        System.out.println("*******************************");
    }

    public static void multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        System.out.println("*******************************");
        System.out.println("El resultado de la multiplicación es: " + resultado);
        System.out.println("*******************************");
    }

    public static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("*******************************");
        System.out.println("El resultado de la división es: " + resultado);
        System.out.println("*******************************");
    }
}
