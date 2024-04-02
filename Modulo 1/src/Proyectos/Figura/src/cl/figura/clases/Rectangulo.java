package cl.figura.clases;

import java.util.Scanner;

public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);
        double area;
        double base;
        double altura;

        System.out.print("Ingrese Base: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese Altura: ");
        altura = scanner.nextDouble();

        area = base * altura;

        return area;
    }

    @Override
    public double calcularArea2() {

        return this.base * this.altura;
    }

}
