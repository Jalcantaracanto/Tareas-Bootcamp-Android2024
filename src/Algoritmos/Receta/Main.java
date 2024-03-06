package Algoritmos.Receta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
        ArrayList<Paso> listaPasos = new ArrayList<>();

        String nombreReceta = "";
        int nPaso = 0;
        System.out.println("Ingrese nombre de receta: ");
        nombreReceta = scanner.nextLine();

        // Solicitar ingreso de ingredientes
        boolean agregarIngrediente = true;
        while (agregarIngrediente) {
            System.out.println("Ingrese nombre del ingrediente: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese cantidad del ingrediente: ");
            String cantidad = scanner.nextLine();

            Ingrediente ingrediente = new Ingrediente(nombre, cantidad);
            listaIngredientes.add(ingrediente);

            // Pedir al usuario si desea agregar otro ingrediente
            String respuesta;
            do {
                System.out.println("¿Desea agregar otro ingrediente? (s/n): ");
                respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Respuesta no válida, Por favor responda con 's' o 'n'");
                }
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

            if (respuesta.equalsIgnoreCase("n")) {
                agregarIngrediente = false;
            }
        }

        // Mostrar ingredientes
        System.out.println("Recordatorio de ingredientes: ");
        for (Ingrediente ingrediente : listaIngredientes) {
            System.out.println(ingrediente.toString());
        }

        System.out.println("\n ***** Ahora vamos por la receta ***** \n");

        // Solicitar pasos de la receta
        boolean agregarPaso = true;
        while (agregarPaso) {
            System.out.println("Ingrese paso: ");
            String descripcion = scanner.nextLine();

            Paso paso = new Paso(descripcion);
            listaPasos.add(paso);

            // Pedir al usuario si desea agregar otro paso
            String respuesta;
            do {
                System.out.println("¿Desea agregar otro paso? (s/n): ");
                respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                    System.out.println("Respuesta no válida, Por favor responda con 's' o 'n'");
                }
            } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

            if (respuesta.equalsIgnoreCase("n")) {
                agregarPaso = false;
            }
        }

        // Mostrar receta completa
        System.out.println("---------- " + nombreReceta + " ----------");
        System.out.println("Ingredientes: ");
        for (Ingrediente ingrediente : listaIngredientes) {
            System.out.println(ingrediente.toString());
        }
        System.out.println("---------- Pasos a seguir ----------");
        for (Paso paso : listaPasos) {
            nPaso++;
            System.out.println(nPaso + paso.toString());
        }
    }
}
