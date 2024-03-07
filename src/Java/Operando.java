package Java;

import java.util.Scanner;

public class Operando {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        String frase1, frase2, union;

        // 1
        System.out.print("Ingrese número 1: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese número 2: ");
        num2 = scanner.nextInt();
        System.out.printf("La suma de los números es: %d\n", (num1 + num2));

        //2
        System.out.print("Ingrese un número para elevarlo a 2: ");
        num1 = scanner.nextInt();
        System.out.printf("%d elevado a 2 es: %.0f\n", num1, Math.pow(num1, 2));
        scanner.nextLine();
        //3
        System.out.print("Ingrese frase 1: ");
        frase1 = scanner.nextLine();
        System.out.print("Ingrese frase 2: ");
        frase2 = scanner.nextLine();
        union = frase1 + frase2;
        System.out.println(union);

        //4
        System.out.print("Ingrese número 1: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese número 2: ");
        num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Números son iguales");
        } else {
            System.out.println("Números son distintos");
        }

    }
}
