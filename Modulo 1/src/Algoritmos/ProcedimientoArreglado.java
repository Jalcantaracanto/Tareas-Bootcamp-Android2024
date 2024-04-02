package Algoritmos;

import java.util.Scanner;

public class ProcedimientoArreglado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int num;
            System.out.printf("Ingrese número %d: ", (i + 1));
            num = scanner.nextInt();
            numeros[i] = num;
        }

        MostrarArreglo(numeros);
    }

    public static void MostrarArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[ %d ]", i);
        }
    }
}
