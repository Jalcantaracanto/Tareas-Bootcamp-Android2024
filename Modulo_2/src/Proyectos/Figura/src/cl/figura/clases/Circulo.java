package cl.figura.clases;

import java.util.Map;
import java.util.Scanner;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);
        double area;
        double radio;

        System.out.print("Ingrese Radio: ");
        radio = scanner.nextDouble();

        area = Math.PI * radio * radio;

        return area;
    }

    @Override
    public double calcularArea2() {
        return Math.PI * this.radio * this.radio;
    }
}
