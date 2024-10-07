package estructuras_dinamicas;

import java.util.ArrayList;

public class EjercicioC {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<>();
		
		System.out.println("Primera prueba: ");
		
		if (e.isEmpty()) {
			System.out.println("El ArrayList está vacío.");
		} else {
			System.out.println("El ArrayList no está vacío.");
		}

		e.add("Prueba 1");

		System.out.println("\nSegunda prueba: ");

		if (e.isEmpty()) {
			System.out.println("El ArrayList está vacío.");
		} else {
			System.out.println("El ArrayList no está vacío.");
		}
	}
}