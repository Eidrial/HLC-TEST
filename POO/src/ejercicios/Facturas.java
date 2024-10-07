package ejercicios;

public class Facturas {

	// Atributos específicos de cada factura
	private int codigo;
	private int vLitro;

	// Atributos estáticos para todos los objetos
	private static double facturacionTotal = 0;
	private static int litrosArticulo1 = 0;
	private static int facturasMasDe600 = 0;

	// Constructor
	public Facturas(int codigo, int vLitro) {
        this.codigo = codigo;
        this.vLitro = vLitro;

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

	// Método que devuelve el precio por litro basado en el código
	public double getPrecioPorLitro() {
		double precio;
		switch (codigo) {
		case 1:
			precio = 0.6; // 0.6 €/litro
			break;
		case 2:
			precio = 3.0; // 3 €/litro
			break;
		case 3:
			precio = 1.25; // 1.25 €/litro
			break;
		default:
			throw new IllegalArgumentException("Código de producto no válido: " + codigo);
		}
		return precio;
	}

	// Método que devuelve el precio total de la factura redondeado a dos decimales
	public double pTotal() {
		return Math.round(getPrecioPorLitro() * vLitro * 100.0) / 100.0; // Redondeo a 2 decimales
	}

	// Métodos estáticos para obtener los totales
	public static double getFacturacionTotal() {
		return Math.round(facturacionTotal * 100.0) / 100.0; // Redondeo a 2 decimales
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
		return String.format(
				"------ FACTURA: \nCódigo del producto: %d\nCantidad vendida en litros: %d\nPrecio del litro: %.2f€\nPrecio total: %.2f€\n",
				codigo, vLitro, getPrecioPorLitro(), pTotal());
	}
}