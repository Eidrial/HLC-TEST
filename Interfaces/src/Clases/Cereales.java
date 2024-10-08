package Clases;

import java.time.LocalDate;

import Enum.tipoCereal;
import Interfaces.EsAlimento;

public class Cereales implements EsAlimento {

	// Atributos
	private String marca;
	private double precio;
	private tipoCereal tipo;
	private LocalDate fc;

	// Constructor
	public Cereales(String marca, double precio, tipoCereal tipo, LocalDate fc) {
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
		this.fc = fc;
	}

	// Getters y setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public tipoCereal getTipo() {
		return tipo;
	}

	public void setTipo(tipoCereal tipo) {
		this.tipo = tipo;
	}
	
	// Interfaces implementadas
	@Override
	public void setCaducidad(LocalDate fc) {
		this.fc = fc;
	}

	@Override
	public LocalDate getCaducidad() {
		return fc;
	}

	@Override
	public int getCalorias() {

		if (getTipo().equals(tipoCereal.avena)) {
			return 5;
		} else if (getTipo().equals(tipoCereal.maiz)) {
			return 8;
		} else if (getTipo().equals(tipoCereal.trigo)) {
			return 12;
		} else {
			return 15;
		}
		
	}

	// toString
	@Override
	public String toString() {
		return "Cereales{marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", caducidad=" + fc +", calorias=" + getCalorias() + "}";
	}


}
