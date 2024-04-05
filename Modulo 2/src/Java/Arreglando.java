package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arreglando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        int mayor = -999999;

        System.out.println("Sistema para detectar número mayor \n");

        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                try {
                    System.out.printf("Ingresé número %d: ", (i + 1));
                    numeros[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Número inválido");
                    scanner.next();
                }
            }
        }

        System.out.println("Tus números son:");
        for (int numero : numeros) {
            System.out.printf("[ %d ] ", numero);
            if (mayor < numero) {
                mayor = numero;
            }
        }
        System.out.printf("\nEl número mayor es: %d", mayor);
    }
}
