package ejercicios;

import java.util.ArrayList;

public class EjercicioE {

	public static void main(String[] args) {
		
		ArrayList<Moviles> listaMovil = new ArrayList<Moviles>();
		
		listaMovil.add(new Moviles("iPhone 12 Pro Max", 1259));
		listaMovil.add(new Moviles("Xiaomi Mi 10 Pro", 999));
		listaMovil.add(new Moviles("Huawei P40 Pro+", 1399));
		listaMovil.add(new Moviles("Samsung Z Flip 5G", 1550));
		listaMovil.add(new Moviles("LG V50", 899));
		listaMovil.add(new Moviles("Xiaomi Mi 10 Pro", 999));
		listaMovil.add(new Moviles("Huawei P40 Pro+", 1399));
		listaMovil.add(new Moviles("Samsung Z Flip 5G ", 1550));
		listaMovil.add(new Moviles("Samsung S30", 1300));
		listaMovil.add(new Moviles("Huawei P50 Pro+", 1399));
		listaMovil.add(new Moviles("Samsung Z Flip 5G", 1550));
		
		System.out.println("LISTA SIN ORDENAR:\n");
		for (Moviles moviles : listaMovil) {
			System.out.println(moviles);
		}

		System.out.println("LISTA ORDENADA:\n");
		
	}

}
