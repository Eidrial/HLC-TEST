package ejercicios;

/*Crear una clase Libro que contenga los siguientes atributos: ● ISBN ● Titulo ● Autor ● Número de páginas
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el
método toString() para mostrar la información relativa al libro con el siguiente formato:
«El libro con ISBN creado por el autor tiene páginas». En el fichero main, crea 2 objetos Libro y muestralos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.*/

public class EjercicioD {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("9788420469287", "Crepúsculo", "Stephenie Meyer", 512);
		Libro l2 = new Libro("9788445003022", "El Señor de los anillos", "J. R. R. Tolkien", 576);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		if (l1.getNumPag() > l2.getNumPag()) {
			System.out.println("El libro '" + l1.getTitulo() + "' tiene más páginas que el libro " + l2.getTitulo() + ".");
		} else {
			System.out.println("El libro '" + l2.getTitulo() + "' tiene más páginas que el libro " + l1.getTitulo() + ".");
		}
		
		
		
	}

}
