import cl.Cafetera.clases.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cafetera cafetera = new Cafetera();

        System.out.println("Agregaremos una nueva cafetera");
        System.out.print("Indique capacidad maxima de la cafetera (ml): ");
        int max = scanner.nextInt();
        cafetera.setCapacidadMaxima(max);
        scanner.nextLine();

        System.out.println("Muy bien, ahora vamos a simular que llenamos la cafetera");
        System.out.println("Presione ENTER para agregar Café");
        scanner.nextLine();
        cafetera.llenarCafetera();

        System.out.println("Ahora serviremos un cafe");
        System.out.print("Indique tamaño de taza (ml): ");
        int cafeMl = scanner.nextInt();
        scanner.nextLine();
        cafetera.servirTaza(cafeMl);

        System.out.println("Serviremos una cafe más...");
        System.out.print("Indique tamaño de taza (ml): ");
        cafeMl = scanner.nextInt();
        scanner.nextLine();
        cafetera.servirTaza(cafeMl);

        System.out.println("A continuacion agregaremos más cafe a la taza");
        System.out.print("Indique cantidad de café a agregar (ml): ");
        int agregar = scanner.nextInt();
        scanner.nextLine();
        cafetera.agregarCafe(agregar);

        System.out.println("Finalmente vaciaremos la cafetera.");
        System.out.println("Presione ENTER para vaciar Cafetera");
        scanner.nextLine();
        cafetera.vaciarCafetera();
        cafetera.getCantidadActual();

    }
}
