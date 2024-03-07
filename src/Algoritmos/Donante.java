package Algoritmos;

import java.util.Scanner;

public class Donante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edad, peso;

        System.out.print("Indique su edad : ");
        edad = scanner.nextInt();

        System.out.print("Indique su peso (Medida en kilos): ");
        peso = scanner.nextInt();

        if (edad >= 18 && edad <= 65) {
            if (peso >= 50) {
                System.out.println("Puede donar sangre");
            } else {
                System.out.println("No puede donar, no está en el rango de peso ideal.");
            }
        } else {
            System.out.println("No puede donar, no esta en el rango de edad ideal");
        }

    }
}
