package Ejercicios;

import java.util.Scanner;

/*Crea 2 matrices de mxm y suma sus valores. Los resultados deben almacenarse
en otra matriz distinta. Los valores y la longitud, seran elegidos por el usuario. Finalmente,
muestra por pantalla las matrices originales y el resultado, para ello debes crear una función
auxiliar que muestre las matrices y se haga la llamada desde la clase Main.*/

public class EjercicioB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tamanio = 0;
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;

		System.out.print("Escribe un tamaño para el array: ");
		tamanio = s.nextInt();

		int[][] array1 = new int[tamanio][tamanio];
		int[][] array2 = new int[tamanio][tamanio];
		int[][] array3 = new int[tamanio][tamanio];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 1: ");
				valor1 = s.nextInt();
				array1[i][j] = valor1;
				System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 2: ");
				valor2 = s.nextInt();
				array2[i][j] = valor2;
				valor3 = valor1 + valor2;
				array3[i][j] = valor3;
			}

		}

		Funciones.mostrarArray1(array1);
		System.out.println();
		Funciones.mostrarArray2(array2);
		System.out.println();
		Funciones.mostrarArray3(array3);

		
		s.close();
	}

}
