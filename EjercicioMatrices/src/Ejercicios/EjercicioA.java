package Ejercicios;

import java.util.Scanner;

/*Crea una matriz con 5 filas y n columnas (Valor que debe pedirse al usuario). A
continuación, rellénalo con números aleatorios entre 0 y 10. Para ello debes crear una
función auxiliar que devuelva el número aleatorio generado y se haga la llamada desde la
clase Main.*/

public class EjercicioA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int columnas = 0;
		
		System.out.print("Introduce el número de columnas que quiere que aparezcan en el array: ");
		columnas = s.nextInt();
		
		int[][]array = new int[5][columnas];
		

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Funciones.numAleatorio();
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("");
		}
		
		s.close();
	
	}
	}
	

