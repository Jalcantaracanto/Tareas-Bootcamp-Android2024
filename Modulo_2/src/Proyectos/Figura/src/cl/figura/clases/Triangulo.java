package cl.figura.clases;

import java.util.Scanner;

public class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
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

        area = (base * altura) / 2;

        return area;
    }

    @Override
    public double calcularArea2() {
        return (base * altura) / 2;
    }
}
