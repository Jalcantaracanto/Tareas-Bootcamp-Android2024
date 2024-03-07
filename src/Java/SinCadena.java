package Java;

import java.util.Scanner;

public class SinCadena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int conteo = 0;
        String cadena;
        System.out.println("Ingrese cadena");
        cadena = scanner.nextLine();

        System.out.printf("La cuarta y quinta letra son: %s\n", cadena.substring(3, 5));

        for (char i : cadena.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                conteo++;
            }
        }
        System.out.printf("La cantidad de vocales son: %d\n", conteo);
        System.out.printf("La cantidad de vocales son: %d\n", cadena.replaceAll("[^aeiouAEIOU]", "").length());
    }
}
