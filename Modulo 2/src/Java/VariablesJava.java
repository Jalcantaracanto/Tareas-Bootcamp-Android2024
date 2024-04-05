package Java;

public class VariablesJava {
    public static void main(String[] args) {

        char identificador = '2';
        System.out.printf("Digito verificador: %c\n", identificador);

        boolean estudiante = true;
        System.out.printf("¿Eres estudiante?: %b\n", estudiante);

        String apellido = "Alcántara";
        System.out.printf("Tú apellido es: %s", apellido);

        int entero = 123;
        short corto = 3;
        byte bite = 23;
        long largo = 1131242897L;
        float flota = 28.12F;
        double doble = 213.43;

        System.out.printf("Valor de entero: %d\n", entero);
        System.out.printf("Valor de corto: %d\n", corto);
        System.out.printf("Valor de bite: %d\n", bite);
        System.out.printf("Valor de largo: %d\n", largo);
        System.out.printf("Valor de flota: %.2f\n", flota);
        System.out.printf("Valor de doble: %.2f\n", doble);
    }
}
