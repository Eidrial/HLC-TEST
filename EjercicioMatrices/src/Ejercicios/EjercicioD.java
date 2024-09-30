package Ejercicios;

import java.util.Scanner;

/*Tabla de 1 dimensión: Pide 5 números que se introducirán ordenados de forma
creciente. Éstos se guardan en una tabla de tamaño 10. A continuación se pide un número N,
el cual debe insertarse en el lugar adecuado para que la tabla continúe ordenada.*/

public class EjercicioD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = 0;
		int numLugar = 0;

		int[] array = new int[10];

		System.out.println("Ahora tendrás que introducir cinco números de forma creciente.");

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el número " + (i + 1) + ":");
			num = s.nextInt();
			array[i] = num;
		}

		System.out.println("Ahora introduce un número cualquiera:");
		numLugar = s.nextInt();

		// para buscar el sitio
		int pos = 0;
		for (int i = 0; i < 5; i++) {
			if (numLugar > array[i]) {
				pos = i + 1;
			}
		}

		// para mover hacia la derecha
		for (int i = 9; i > pos; i--) {
			array[i] = array[i - 1];
		}

		array[pos] = numLugar;

		System.out.println("El array ordenado es:");
		for (int i = 0; i < array.length; i++) { 
			System.out.print(array[i] + " ");
		}

		s.close();
	}
}