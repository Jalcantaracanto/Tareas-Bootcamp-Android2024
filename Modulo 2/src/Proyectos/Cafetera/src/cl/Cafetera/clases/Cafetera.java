package cl.Cafetera.clases;

public class Cafetera {

    // Atributos
    private int capacidadMaxima;
    private int cantidadActual;


    //Constructores
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Accesadores


    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


    //Metodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("La cafetera se a llenado!!!");
    }

    public void servirTaza(int tamanoTaza) {

        if (tamanoTaza > this.cantidadActual) {
            tamanoTaza = this.cantidadActual;
            System.out.printf("Solo se pudo llenar con %dml de café", this.cantidadActual);
            this.cantidadActual -= this.cantidadActual;
        } else {
            this.cantidadActual -= tamanoTaza;
            System.out.println("Llenaste la taza de Café\n");
            System.out.printf("La cantidad restante de agua es: %d'\n", this.cantidadActual);
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("La cafetera se a vaciado");
    }

    public void agregarCafe(int cafeAgregado) {
        int cantidadRestante = this.capacidadMaxima - this.cantidadActual;

        if (this.capacidadMaxima < cantidadRestante) {
            System.out.printf("No puedes agregár tanto Café, la capacidad máxima es: %d", this.capacidadMaxima);
        } else {
            this.cantidadActual += cafeAgregado;
            System.out.println("Cantidad de café agregada");
            System.out.printf("Café disponible: %d\n", this.cantidadActual);
        }
    }
}
