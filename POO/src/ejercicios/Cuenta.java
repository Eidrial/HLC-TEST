package ejercicios;

public class Cuenta {

	private String titular;
	private double cantidad;

	// Constructor 1: Solo recibe el titular (la cantidad por defecto será 0.0)
	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0.0;
	}

	// Constructor 2: Recibe el titular y la cantidad
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(double cantidad) {
		// Si la cantidad es positiva, se añade a la cuenta
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	public void retirar(double cantidad) {
		// Si la cantidad retirada es mayor que el saldo, la cantidad se pone a 0
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0.0;
		} else {
			this.cantidad -= cantidad;
		}
	}

	@Override
	public String toString() {
		return "Titular: " + titular + ", Cantidad: " + cantidad;
	}

}