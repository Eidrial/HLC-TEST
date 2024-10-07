package ejercicios;

import java.util.Objects;

public class Moviles implements Comparable<Moviles> {

	private String marca;
	private int precio;

	public Moviles(String marca, int precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moviles other = (Moviles) obj;
		return Objects.equals(marca, other.marca) && precio == other.precio;
	}

	@Override
	public String toString() {
		return marca + " \t\t (" + precio + " euros) ";
	}

	@Override
	public int compareTo(Moviles otro) {
		int comparacionPrecio = Double.compare(this.precio, otro.precio);

		if (comparacionPrecio == 0) {
			return this.marca.compareTo(otro.marca);
		}

		return comparacionPrecio;
	}
}