package Ejercicios;

/*Crea una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
los de los bordes que deben ser 1. Muestra el resultado.*/

public class EjercicioC {
	
	public static void main(String[] args) {

		int fila = 8;
		int columna = 6;
		
		int[][]marco = new int[fila][columna];
		
		System.out.println("Matriz marco: \n");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				if (i == 0 || j == 0 || i == fila - 1 || j == columna - 1) {
					marco[i][j] = 1; 
				}
				System.out.print(marco[i][j] + "  ");
			}
			System.out.println("");
		}
		
	}
}
