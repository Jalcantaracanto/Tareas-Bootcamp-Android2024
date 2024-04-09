package Algoritmos.Receta;

public class Paso {
    private String descripcion;

    public Paso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "- " + descripcion;
    }
}
