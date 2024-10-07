package estructuras_dinamicas;

import java.util.ArrayList;

public class EjercicioF {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<>();
		
		e.add("Prueba 1");
		e.add("Prueba 2");
		e.add("Prueba 3");

		for (int i = 0; i < e.size(); i++) {
			System.out.println("Posición: " + i + ": " + e.get(i));
		}
	}
}