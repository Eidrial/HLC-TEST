package estructuras_dinamicas;

import java.util.ArrayList;

public class EjercicioE {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<>();
		
		e.add("Prueba 1");
		e.add("Prueba 2");
		e.add("Prueba 3");

		e.set(1, "Reemplazo");

		System.out.println("Después del reemplazo: " + e);
	}
}