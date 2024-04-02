package cl.Mascotas.Class;

import java.util.Scanner;

public class Perro {
    private String nombre;
    private String raza;
    private int tamano;


    public Perro(String nombre, String raza, int tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getTamano() {
        return tamano;
    }

    public static Perro crearPerro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Creación de Perro ****");

        System.out.print("Ingresé nombre:");
        String nombrePerro = scanner.nextLine();

        System.out.print("Ingresé raza: ");
        String razaPerro = scanner.nextLine();

        System.out.print("Ingresé Tamaño (cms): ");
        int tamanoPerro = scanner.nextInt();


        return new Perro(nombrePerro, razaPerro, tamanoPerro);
    }
}
