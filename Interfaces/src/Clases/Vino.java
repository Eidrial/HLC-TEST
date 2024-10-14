package Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Interfaces.ConDescuento;
import Interfaces.EsAlimento;
import Interfaces.EsLiquido;
import Enum.tipoVino;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {

	// Atributos
	private String marca;
	private double grados;
	private double precio;
	private tipoVino tipo;
	private int volumen;
	private String env;
	private double desc;
	private LocalDate fc; 

	// Constructor
	public Vino(String marca, double grados, double precio, tipoVino tipo, int volumen, String env, double desc,
			LocalDate fc) {
		this.marca = marca;
		this.grados = grados;
		this.precio = precio;
		this.tipo = tipo;
		this.volumen = volumen;
		this.env = env;
		this.desc = desc;
		this.fc = fc; 
	}

	// Getters y setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public tipoVino getTipo() {
		return tipo;
	}

	public void setTipo(tipoVino tipo) {
		this.tipo = tipo;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	// Implementación de métodos
	@Override
	public void setDescuento(double des) {
		this.desc = des;
	}

	@Override
	public double getDescuento() {
		return desc;
	}

	@Override
	public double getPrecioDescuento() {
		return precio - (precio * (desc / 100));
	}

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
		return (int) (grados * 10);
	}

	@Override
	public void setTipoEnvase(String env) {
		this.env = env;
	}

	@Override
	public String getTipoEnvase() {
		return env;
	}

	// toString
	@Override
	public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Vino{marca=" + marca + ", tipoVino=" + tipo + ", grados=" + grados + ", precio=" + precio + ", volumen="
				+ volumen + " ml, tipoEnvase=" + env + ", caducidad=" + fc.format(formatter) + ", descuento=" + desc + ", precio con descuento="
				+ getPrecioDescuento() + ", calorias=" + getCalorias() + "}";
	}
}