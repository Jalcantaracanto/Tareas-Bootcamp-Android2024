package Java;

import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        char continuar = 's';

        while (continuar == 's') {

            System.out.print("Ingrese Número: ");
            num = scanner.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }

            if (num % 2 == 0) {
                System.out.println("número es par");
            } else {
                System.out.println("Número es impar");
            }

            System.out.println("¿Desea intentar nuevamente?");
            String input = scanner.next();
            if (input.length() == 1) {
                continuar = input.charAt(0);
            } else {
                continuar = 'n';
            }
        }
    }
}
