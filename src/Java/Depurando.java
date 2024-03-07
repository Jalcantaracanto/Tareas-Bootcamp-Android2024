package Java;

public class Depurando {
    public static void main(String[] args) {

        int x = 0;
        depurar(x);
    }

    private static void depurar(int x) {
        while (x < 1) {
            System.out.println("ciclo");
        }
    }

    /**
     * Hay un ciclo infinito
     */

}
