package Algoritmos;

import java.util.Scanner;

public class EsMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        String respuesta;

        do {
            System.out.println("Ingrese su edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println(esImpar(edad));

            do {
                System.out.println("¿Desea probar con otra edad? (s/n)");
                respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Opción no válida. Por favor, ingrese 's' o 'n'.");
                }
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Hasta pronto");
    }

    public static String esImpar(int edad) {
        String resultado;
        if (edad >= 18) {
            resultado = "Eres mayor de edad";
        } else {
            resultado = "Eres menor de edad";
        }
        return resultado;
    }
}
