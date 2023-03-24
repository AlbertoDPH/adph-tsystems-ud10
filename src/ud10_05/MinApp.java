package ud10_05;

import java.util.Scanner;

public class MinApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el número de contraseñas: ");
		int numPasswords = scan.nextInt();

		System.out.print("Introduce la longitud de las contraseñas: ");
		int longitud = scan.nextInt();

		// Array que guarda las contraseñas de longitud pasada por consola
		Password[] passwords = new Password[numPasswords];

		// Array de booleans que guarda si la contraseña es true o false de longitud
		// igual al número de contraseñas
		boolean[] esFuerteArray = new boolean[numPasswords];

		// Con el bucle iteramos sobre los dos arrays
		for (int i = 0; i < numPasswords; i++) {
			// Guarda en la posición i un objeto de tipo Password
			passwords[i] = new Password(longitud);
			// Guarda en la posición i el resultado de la contraseña llamando al método que
			// controla
			// si es fuerte o no.
			esFuerteArray[i] = passwords[i].esFuerte();
		}

		// Mostramos las contraseñas y el resultado de los requisitos
		for (int i = 0; i < numPasswords; i++) {
			System.out.println("contraseña" + (i + 1) + " " + passwords[i].getContrasena() + " " + esFuerteArray[i]);
		}

		scan.close();

	}

}
