package ejercicios;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para
gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo
1 y cuantas facturas se emitieron de más de 600 €.*/

public class EjercicioB {

	public static void main(String[] args) {

		Desinfectantes d1 = new Desinfectantes(1, 88, 2.30);
		Desinfectantes d2 = new Desinfectantes(2, 5, 1.30);
		Desinfectantes d3 = new Desinfectantes(1, 400, 3);
		Desinfectantes d4 = new Desinfectantes(3, 20, 1.10);
		Desinfectantes d5 = new Desinfectantes(1, 30, 2.66);

		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString() + d3.mSeiscientos() + "\n");
		System.out.println(d4.toString());
		System.out.println(d5.toString());
		
		int totalC = d1.getvLitro() + d3.getvLitro() + d5.getvLitro();
		
		System.out.println("Total de litros vendidos del producto 1: " + totalC + " litros.");

		

	}

}
