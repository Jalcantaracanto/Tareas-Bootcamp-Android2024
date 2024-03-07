package Java;

import java.util.Scanner;

public class MathAlgo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();

        System.out.printf("El doble del número es: %d\n", (num * 2));
        System.out.printf("El doble del número es: %d\n", (num * 3));
        System.out.printf("El doble del número es: %f\n", Math.sqrt(num));
        System.out.printf("El doble del número es: %f\n", Math.pow(num, 7));

    }
}
