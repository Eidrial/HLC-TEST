package ejercicios;

public class Desinfectantes {

	// Atributos específicos de cada factura
	private int codigo;
	private int vLitro;
	private double pLitro;

	// Atributos estáticos para todos los objetos
	private static double facturacionTotal = 0;
	private static int litrosArticulo1 = 0;
	private static int facturasMasDe600 = 0;

	// Constructor
	public Desinfectantes(int codigo, int vLitro, double pLitro) {
		this.codigo = codigo;
		this.vLitro = vLitro;
		this.pLitro = pLitro;

		// Actualizar facturación total al crear una factura
		facturacionTotal += pTotal();

		// Actualizar litros vendidos del artículo 1
		if (codigo == 1) {
			litrosArticulo1 += vLitro;
		}

		// Contar si la factura es mayor o igual a 600 €
		if (pTotal() >= 600) {
			facturasMasDe600++;
		}
	}

	// Métodos getter
	public int getCodigo() {
		return codigo;
	}

	public int getvLitro() {
		return vLitro;
	}

	public double getpLitro() {
		return pLitro;
	}

	  // Método que devuelve el precio total de la factura redondeado a dos decimales
    public double pTotal() {
        return Math.round(pLitro * vLitro * 100.0) / 100.0;
    }

    // Métodos estáticos para obtener los totales
    public static double getFacturacionTotal() {
        return Math.round(facturacionTotal * 100.0) / 100.0;
    }

    public static int getLitrosArticulo1() {
        return litrosArticulo1;
    }

    public static int getFacturasMasDe600() {
        return facturasMasDe600;
    }

	// Método toString para mostrar los detalles de la factura
    @Override
    public String toString() {
        return String.format("------ FACTURA: \nCódigo del producto: %d\nCantidad vendida en litros: %d\nPrecio del litro: %.2f€\nPrecio total: %.2f€\n", 
                             codigo, vLitro, pLitro, pTotal());
    }
    
    //%d: Para imprimir números enteros.
    //%f: Para imprimir números de coma flotante (decimales), y .2 asegura que siempre tenga dos decimales.
}
