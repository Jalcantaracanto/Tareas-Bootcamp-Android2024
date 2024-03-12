package cl.Mascotas.Class;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private String rut;
    private int edad;
    private Perro perro;

    public Persona(String nombre, String rut, int edad, Perro perro) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    //Metodos

    public static Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Rut: ");
        String rut = scanner.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = scanner.nextInt();

        Perro nuevoPerro = Perro.crearPerro();

        return new Persona(nombre, rut, edad, nuevoPerro);
    }

    public void mostrarDatos() {
        System.out.println("**** Datos Persona ****");
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Rut: %s\n", this.rut);
        System.out.printf("Rut: %d\n", this.edad);

        System.out.println("**** Datos Perro ****");
        System.out.printf("Nombre: %s\n", this.perro.getNombre());
        System.out.printf("Raza: %s\n", this.perro.getRaza());
        System.out.printf("Tamaño: %d cms\n", this.perro.getTamano());

    }
}
