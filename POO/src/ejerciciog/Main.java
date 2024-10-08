package ejerciciog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce el nombre: ");
		String nombre = s.nextLine();
		System.out.print("Introduce la edad: ");
		int edad = s.nextInt();
		System.out.print("Introduce el sexo (H/M): ");
		char sexo = s.next().charAt(0);
		System.out.print("Introduce el peso (kg): ");
		double peso = s.nextDouble();
		System.out.print("Introduce la altura (m): ");
		double altura = s.nextDouble();

		Persona persona1 = new Persona(nombre, edad, sexo);
		persona1.setPeso(peso);
		persona1.setAltura(altura);

		Persona persona2 = new Persona(nombre, edad, sexo);

		Persona persona3 = new Persona();
		persona3.setNombre("Paco");
		persona3.setEdad(30);
		persona3.setSexo('G');
		persona3.setPeso(90.0);
		persona3.setAltura(1.75);

		ArrayList<Persona> p = new ArrayList<Persona>();

		p.add(persona1);
		p.add(persona2);
		p.add(persona3);

		for (Persona persona : p) {
			int imc = persona.calcularIMC();
			String imcInf;

			if (imc == -1) {
				imcInf = "por debajo de su peso ideal";
			} else if (imc == 0) {
				imcInf = "en su peso ideal";
			} else {
				imcInf = "con sobrepeso";
			}
			
			System.out.println("\n" + persona);
			System.out.println(persona.getNombre() + " tiene " + imcInf);
			
			String mensaje;
			if (persona.esMayorDeEdad()) {
				mensaje = persona.getNombre() + " es mayor de edad.";
			} else {
				mensaje = persona.getNombre() + " es menor de edad.";
			}
			
			System.out.println(mensaje + "\n");
			
		}

		s.close();
	}
}