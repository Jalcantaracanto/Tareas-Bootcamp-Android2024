package Algoritmos;

import java.util.Scanner;

public class EsMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            num = scanner.nextInt();
            contador++;
            if (num % 5 == 0) {
                impares++;
                break;
            } else if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.printf("Cantidad de números leídos: %d\n", contador);
        System.out.printf("Cantidad de números pares: %d\n", pares);
        System.out.printf("Cantidad de números impares: %d\n", impares);
    }
}
