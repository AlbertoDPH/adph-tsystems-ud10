package ud10_04;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Atributos
		double num1, num2;

		// Instanciamos un objeto de la clase Calculadora
		Calculadora calc = new Calculadora();

		// Pasamos los valores por consola
		System.out.print("Num 1: ");
		num1 = scanner.nextDouble();
		System.out.print("NUm 2: ");
		num2 = scanner.nextDouble();

		// Mostramos los resultados de las diferentes operaciones llamado a los metodos
		System.out.println("Suma: " + calc.suma(num1, num2));
		System.out.println("Resta: " + calc.resta(num1, num2));
		System.out.println("Multiplicacion: " + calc.multiplicacion(num1, num2));

		// Controlamos la excecpion de division entre 0
		try {
			System.out.println("Division: " + calc.division(num1, num2));
		} catch (ArithmeticException e) {
			System.err.println("Error en division: " + e.getMessage());
		}

		System.out.println("Potencia: " + calc.potencia(num1, num2));
		System.out.println("Raiz cuadrada: " + calc.raizCuadrada(num1));
		System.out.println("Raiz cubica: " + calc.raizCubica(num1));
	}

}
