package Clases;

import Interfaces.ConDescuento;
import Interfaces.EsLiquido;

public class Detergente implements EsLiquido, ConDescuento {

	// Atributos
	private String marca;
	private double precio;
	private int volumen;
	private String env;
	private double desc;

	// Constructor
	public Detergente(String marca, double precio, int volumen, String env, double desc) {
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
		this.env = env;
		this.desc = desc;
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

	@Override
	public void setVolumen(int v) {
		this.volumen = v;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}

	//Implementación de métodos
	@Override
	public void setTipoEnvase(String env) {
		this.env = env;
	}
	

	@Override
	public String getTipoEnvase() {
		return env;
	}
	
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
		double decimalDes = desc / 100;
		double tDescuento = decimalDes * getPrecio();
		return getPrecio() - tDescuento;
	}

	@Override
	public String toString() {
		return "Detergente{marca=" + marca + ", precio=" + precio + ", volumen=" + getVolumen() + "ml, tipoEnvase="+ getTipoEnvase() + ", descuento=" + getDescuento() + ", precio con descuento=" + getPrecioDescuento() + "}";
	}

}
