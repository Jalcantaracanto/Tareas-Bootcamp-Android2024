import cl.Mascotas.Class.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = Persona.crearPersona();
        Persona persona2 = Persona.crearPersona();

        persona1.mostrarDatos();
        persona2.mostrarDatos();

    }
}
