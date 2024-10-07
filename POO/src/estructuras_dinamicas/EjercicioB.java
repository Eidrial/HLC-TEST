package estructuras_dinamicas;

import java.util.ArrayList;

public class EjercicioB {

	public static void main(String[] args) {
		ArrayList<String> e = new ArrayList<>();
		e.add("Prueba 1");
		e.add("Prueba 2");
		e.add("Prueba 3");

		System.out.println("Antes de vaciarlo: " + e);

		e.clear();

		System.out.println("Después de vaciarlo: " + e);
	}

}
