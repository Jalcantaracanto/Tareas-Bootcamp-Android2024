package Algoritmos;

import java.util.Scanner;

public class Superliga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int partidosGanados, partidosEmpatados, partidosPerdidos, puntajePGanados, puntajePEmpatados, puntajeTotal;

        System.out.print("Ingrese cantidad de partidos Ganados: ");
        partidosGanados = scanner.nextInt();
        System.out.print("Ingrese cantidad de partidos Empatados: ");
        partidosEmpatados = scanner.nextInt();
        System.out.print("Ingrese cantidad de partidos Perdidos: ");
        partidosPerdidos = scanner.nextInt(); //No hace nada pero al menos pregunta jaja.

        puntajePGanados = partidosGanados * 3;
        puntajePEmpatados = partidosEmpatados;
        puntajeTotal = puntajePGanados + puntajePEmpatados;

        System.out.printf("El puntaje total que obtuvo tu equipo es: %d", puntajeTotal);
    }
}
