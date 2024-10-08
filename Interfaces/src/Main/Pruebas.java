package Main;

import java.time.LocalDate;

import Clases.Cereales;
import Clases.Detergente;
import Enum.tipoCereal;

public class Pruebas {

	public static void main(String[] args) {

	Cereales c1 = new Cereales("Fitness fiber", 2.25, tipoCereal.trigo, LocalDate.of(2025, 04, 20));
		
	System.out.println(c1.toString());
		
	Detergente d1 = new Detergente("agerul", 6.0, 5000, "Botella_de_plastico_grande");
	System.out.println(d1.toString());
	
	}

}
