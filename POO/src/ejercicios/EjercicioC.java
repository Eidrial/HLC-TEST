package ejercicios;

import java.util.Scanner;

/*Igual que el ejercicio b) pero suponiendo que no se introduce el precio por litro.
Solo existen tres productos con precios: 1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.*/

public class EjercicioC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el código del artículo (1, 2 o 3):");
            int codigo = s.nextInt();
            System.out.println("Introduce la cantidad vendida en litros:");
            int cantidad = s.nextInt();

            Facturas factura = new Facturas(codigo, cantidad);
            System.out.println(factura);
        }

        System.out.println("Facturación total: " + Facturas.getFacturacionTotal());
        System.out.println("Cantidad en litros vendidos del artículo 1: " + Facturas.getLitrosArticulo1());
        System.out.println("Número de facturas de más de 600 €: " + Facturas.getFacturasMasDe600());
        
        s.close();
    }

}
