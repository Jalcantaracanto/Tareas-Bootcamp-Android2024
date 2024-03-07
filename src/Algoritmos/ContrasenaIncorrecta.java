package Algoritmos;

import java.util.Scanner;

public class ContrasenaIncorrecta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasena = "contraseña";
        boolean reintentar = true;
        String respuesta;

        do {
            System.out.println("Ingresa la contraseña: ");
            respuesta = scanner.nextLine();
            if (contrasena.equalsIgnoreCase(respuesta)) {
                System.out.println("Contraseña Correcta");
                break;
            } else {
                do {
                    System.out.println("Contraseña Incorrecta, ¿desea volver a intentar?");
                    respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        break;
                    } else if (!respuesta.equalsIgnoreCase("n") && !respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Opción no válida");
                    } else {
                        System.out.println("Hasta pronto");
                        reintentar = false;
                        break;
                    }
                } while (true);
            }
        } while (reintentar);
    }
}
