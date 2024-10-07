package estructuras_dinamicas;

import java.util.ArrayList;

public class EjercicioD {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<>();
		
		e.add("Prueba 1");
		e.add("Prueba 2");
		e.add("Prueba 3");

		e.trimToSize();

		System.out.println("Después del 'trimToSize()': " + e.size());
		
		System.out.println("Se borrará 'Prueba 2'.");
		
		e.remove("Prueba 2");
		
		System.out.println("'trimToSize()' después de borrar 'Prueba 2': " + e.size());

	}
}