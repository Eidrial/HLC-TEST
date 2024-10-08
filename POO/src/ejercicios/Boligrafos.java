package ejercicios;

public class Boligrafos implements Comparable<Boligrafos> {
    private String modelo;
    private String marca;
    private double precio;

    public Boligrafos(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return modelo + " (" + precio + "€)";
    }

    @Override
    public int compareTo(Boligrafos otro) {
        // Ordenar por marca alfabéticamente
        return this.marca.compareTo(otro.marca);
    }
}