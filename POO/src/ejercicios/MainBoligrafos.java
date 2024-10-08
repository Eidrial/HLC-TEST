package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class MainBoligrafos {

	public static void main(String[] args) {
		ArrayList<Boligrafos> bolis = new ArrayList<>();

        bolis.add(new Boligrafos("Pilot SuperGrip", "Pilot", 1.0));
        bolis.add(new Boligrafos("Pilot G2", "Pilot", 1.3));
        bolis.add(new Boligrafos("Bic Cristal", "Bic", 0.5));
        bolis.add(new Boligrafos("Pilot G2", "Pilot", 1.3));

        Boligrafos boli1 = bolis.get(0);
        Boligrafos boli2 = bolis.get(1);
        System.out.println("Comparando: " + boli1 + " y " + boli2);
        if (boli1.getPrecio() < boli2.getPrecio()) {
            System.out.println(boli1 + " es más barato que " + boli2 + "\n");
        } else if (boli1.getPrecio() > boli2.getPrecio()) {
            System.out.println(boli1 + " es más caro que " + boli2 + "\n");
        } else {
            System.out.println(boli1 + " y " + boli2 + " tienen el mismo precio.\n");
        }

        Boligrafos boli4 = bolis.get(3);
        System.out.print("Comparando: " + boli2 + " y " + boli4 + "\n");
        if (boli2.getPrecio() < boli4.getPrecio()) {
            System.out.println(boli2 + " es más barato que " + boli4 + "\n");
        } else if (boli2.getPrecio() > boli4.getPrecio()) {
            System.out.println(boli2 + " es más caro que " + boli4 + "\n");
        } else {
            System.out.println(boli2 + " y " + boli4 + " tienen el mismo precio.\n");
        }

        Collections.sort(bolis);

        System.out.println("\nBolígrafos ordenados por marca:");
        for (Boligrafos boli : bolis) {
            System.out.println(boli);
        }
    }
}