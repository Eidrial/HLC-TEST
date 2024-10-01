package ejercicios;

public class Desinfectantes {

	private int codigo;
	private int vLitro;
	private double pLitro;

	public Desinfectantes(int codigo, int vLitro, double pLitro) {
		this.codigo = codigo;
		this.vLitro = vLitro;
		this.pLitro = pLitro;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getvLitro() {
		return vLitro;
	}

	public void setvLitro(int vLitro) {
		this.vLitro = vLitro;
	}

	public double getpLitro() {
		return pLitro;
	}

	public void setpLitro(double pLitro) {
		this.pLitro = pLitro;
	}

	public double pTotal() {
		double total = pLitro * vLitro;
		return total;
	}
	
	public String mSeiscientos() {
		int total = (int) pTotal();
		String f = "";
		
		if (total >= 600) {
			f = "La factura es de 600€ o más.";
		} else {
			f = "La factura no es de 600€ o más.";
		}
				
		return f;
	}

	@Override
	public String toString() {
		return "------ FACTURA: \nCódigo del producto: " + codigo + "\nCantidad vendida en litros: " + vLitro
				+ "\nPrecio del litro: " + pLitro + "€" + "\nPrecio total: " + Math.round(pTotal()) + "€\n";
	}

}
