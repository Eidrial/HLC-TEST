package ejercicios;

import java.util.ArrayList;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para
gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo
1 y cuantas facturas se emitieron de más de 600 €.*/

public class EjercicioB {

	public static void main(String[] args) {

		// Crear lista de facturas
		ArrayList<Desinfectantes> facturas = new ArrayList<>();
		facturas.add(new Desinfectantes(1, 88, 2.30));
		facturas.add(new Desinfectantes(2, 5, 1.30));
		facturas.add(new Desinfectantes(1, 400, 3));
		facturas.add(new Desinfectantes(3, 20, 1.10));
		facturas.add(new Desinfectantes(1, 30, 2.66));

		// Mostrar los detalles de las facturas
		for (Desinfectantes factura : facturas) {
			System.out.println(factura.toString());
		}

		// Mostrar la facturación total usando printf
		System.out.printf("Facturación total: %.2f€\n", Desinfectantes.getFacturacionTotal());

		// Mostrar la cantidad de litros vendidos del artículo 1 usando printf
		System.out.printf("Total de litros vendidos del artículo 1: %d litros.\n", Desinfectantes.getLitrosArticulo1());

		// Mostrar cuántas facturas son mayores o iguales a 600 € usando printf
		System.out.printf("Cantidad de facturas mayores o iguales a 600€: %d\n", Desinfectantes.getFacturasMasDe600());
	}
}