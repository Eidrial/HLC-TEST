package ejercicios;

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
cantidad (La cual puede tener decimales).
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo
anterior.
Crea sus métodos get, set y toString. Tendrá dos métodos especiales:
● ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
introducida es negativa, no se hará nada.
● retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/

public class EjercicioA {

	public static void main(String[] args) {
		// cuenta con solo titular
		Cuenta cuenta1 = new Cuenta("Juan");
		System.out.println(cuenta1);

		// ingresa dinero
		cuenta1.ingresar(150.75);
		System.out.println("Se ha ingresado dinero.");
		System.out.println("Estado actual de la cuenta: \n" + cuenta1);

		// retira dinero
		cuenta1.retirar(50.25);
		System.out.println("Se ha retirado dinero.");
		System.out.println("Estado actual de la cuenta: \n" + cuenta1);

		// eretirar mas de lo que tiene
		cuenta1.retirar(200);
		System.out.println("Se ha retirado dinero.");
		System.out.println("Estado actual de la cuenta: \n" + cuenta1);
		
		System.out.println();

		// cuenta con titular y cantidad inicial
		Cuenta cuenta2 = new Cuenta("Maria", 300.50);
		System.out.println(cuenta2);
	}

}
