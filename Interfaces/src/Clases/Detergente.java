package Clases;

import Interfaces.ConDescuento;
import Interfaces.EsLiquido;

public class Detergente implements EsLiquido, ConDescuento {

	// Atributos
	private String marca;
	private double precio;
	private int volumen;
	private String env;

	// Constructor
	public Detergente(String marca, double precio, int volumen, String env) {
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
		this.env = env;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Detergente {marca=" + marca + ", precio=" + precio + ", tipoEnvase="+ getTipoEnvase() +"}";
	}



}
