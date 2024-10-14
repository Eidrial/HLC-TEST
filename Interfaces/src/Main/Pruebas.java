package Main;

import java.time.LocalDate;
import java.util.ArrayList;

import Clases.Cereales;
import Clases.Detergente;
import Clases.Vino;
import Enum.tipoCereal;
import Enum.tipoVino;

public class Pruebas {

	public static void main(String[] args) {
	        //Lista de alimentos
	        ArrayList<Cereales> cerealesList = new ArrayList<>();
	        cerealesList.add(new Cereales("Oatmeal", 3.0, tipoCereal.avena, LocalDate.parse("2025-03-11")));
	        cerealesList.add(new Cereales("Fitness Fiber", 2.25, tipoCereal.trigo, LocalDate.parse("2025-04-20")));

	        ArrayList<Vino> vinoList = new ArrayList<>();
	        vinoList.add(new Vino("MarcaVino1", 12.0, 8.0, tipoVino.tinto, 700, "Botella_de_cristal", 5.0, LocalDate.parse("2025-07-01")));
	        vinoList.add(new Vino("MarcaVino2", 6.0, 5.3, tipoVino.rosado, 330, "Botella_de_cristal", 5.0, LocalDate.parse("2025-03-03")));

	        //Calorías
	        int totalCalorias = 0;
	        System.out.println("Listado de alimentos:");

	        for (Cereales cereal : cerealesList) {
	            System.out.println(cereal);
	            totalCalorias += cereal.getCalorias();
	        }

	        for (Vino vino : vinoList) {
	            System.out.println(vino);
	            totalCalorias += vino.getCalorias();
	        }

	        System.out.println("Total de calorías: " + totalCalorias);

	        //Lista de limpieza
	        ArrayList<Detergente> detergentesList = new ArrayList<>();
	        detergentesList.add(new Detergente("agerul", 6.0, 5000, "Botella_de_plastico_grande", 20.0));
	        detergentesList.add(new Detergente("dixan", 4.0, 2500, "Botella_de_plastico_mediana", 10.0));
	        detergentesList.add(new Detergente("norit", 1.25, 500, "Botella_de_plastico_pequeña", 2.0));

	        //Totales
	        double totalDescuentos = 0.0;
	        double totalImporteDetergentes = 0.0;

	        System.out.println("\nListado de líquidos:");
	        for (Detergente detergente : detergentesList) {
	            System.out.println(detergente);
	            totalImporteDetergentes += detergente.getPrecio(); 
	            totalDescuentos += detergente.getPrecioDescuento(); 
	        }

	        //Dnero ahorrado
	        double dineroAho = totalImporteDetergentes - totalDescuentos;
	        double totalDescuentosPorcentaje = (totalDescuentos / totalImporteDetergentes) * 100;
	 
	        System.out.printf("Total de descuentos: %.0f%%%n", totalDescuentosPorcentaje);
	        System.out.printf("Dinero ahorrado: %.3f euros%n", dineroAho);
	    }
	}