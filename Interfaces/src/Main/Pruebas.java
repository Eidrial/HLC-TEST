package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Clases.Cereales;
import Clases.Detergente;
import Clases.Vino;
import Enum.tipoCereal;
import Enum.tipoVino;

public class Pruebas {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Cereales c1 = new Cereales("Fitness fiber", 2.25, tipoCereal.trigo, LocalDate.parse("20/04/2025", formatter));
	
	System.out.println(c1.toString());
		
	Detergente d1 = new Detergente("agerul", 6.0, 5000, "Botella_de_plastico_grande", 20);
	System.out.println(d1.toString());
	
	Vino v1 = new Vino("MarcaVino1", 12, 8, tipoVino.tinto, 700, "Botella_de_cristal", 5);
	System.out.println(v1.toString());
	
	}

}
