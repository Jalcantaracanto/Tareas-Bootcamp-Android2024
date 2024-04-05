package Java;

import java.util.Scanner;

public class Ejecutando {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre, ocupacion;
        int edad;

        //Solicita nombre y se ingresa
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();

        //Solicita edad y se ingresa
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        //Solicita ocupacion y se ingresa
        System.out.print("Ocupación: ");
        ocupacion = scanner.nextLine();
        scanner.close();

        System.out.printf("Su nombre es: %s\n", nombre);
        System.out.printf("Su edad es: %d\n", edad);
        System.out.printf("Su ocupación es: %s\n", ocupacion);
    }
}
