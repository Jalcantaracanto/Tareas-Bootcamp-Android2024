package Algoritmos;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamaño;
        int suma = 0;

        System.out.print("Ingrese número de vector: ");
        tamaño = scanner.nextInt();

        int[] vector = new int[tamaño];

        System.out.println("*** Ahora llenaremos el Vector ***");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("\nIngrese número en posición %d: ", i);
            vector[i] = scanner.nextInt();
            suma += vector[i];
        }

        System.out.printf("La suma total es: %d", suma);
    }
}
