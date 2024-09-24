package Ejercicios;

public class Funciones {

	public static int numAleatorio() {
		
		return (int) (Math.random()* 11);
		
	}
	
	public static void mostrarArray1(int[][] array1) {
		System.out.println("Matriz 1:");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + "  ");
			}
			System.out.println("");
		}

	}
	
	public static void mostrarArray2(int[][] array2) {
		System.out.println("Matriz 2:");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "  ");
			}
			System.out.println("");
		}

	}
	
	public static void mostrarArray3(int[][] array3) {
		System.out.println("Matriz resultante:");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] + "  ");
			}
			System.out.println("");
		}

	}
	
}
