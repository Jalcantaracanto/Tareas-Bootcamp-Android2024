import cl.figura.clases.Circulo;
import cl.figura.clases.Rectangulo;
import cl.figura.clases.Triangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        Triangulo triangulo1 = new Triangulo();
        Circulo circulo1 = new Circulo();

        System.out.println(rectangulo1.calcularArea());
        System.out.println(triangulo1.calcularArea());
        System.out.println(circulo1.calcularArea());


        Rectangulo rectangulo2 = new Rectangulo(2, 5);
        Triangulo triangulo2 = new Triangulo(12, 5);
        Circulo circulo2 = new Circulo(13.5);

        System.out.println(rectangulo2.calcularArea2());
        System.out.println(triangulo2.calcularArea2());
        System.out.println(circulo2.calcularArea2());
        
    }
}
