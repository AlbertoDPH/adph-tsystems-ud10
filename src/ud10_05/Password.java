package ud10_05;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasena;

	// Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contrasena = generarPassword();
	}

	// Constructor personalizado
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	// Getters
	public String getContrasena() {
		return contrasena;
	}

	public int getLongitud() {
		return longitud;
	}

	// Regenera la contrasena con una nueva longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	/**
	 * Genera una contraseña aleatoria a traves de un Random con los la cadena
	 * caracteres Y los va almacenando en una variable de tipo StringBilder.
	 *
	 * @return devuelve la contraseña generada
	 */
	private String generarPassword() {
		Random rnd = new Random();
		// Atributos
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		// Lo usaremos para almacenar la contraseña
		StringBuilder sbPassword = new StringBuilder();

		// genera caracteres aleatorios y lo inserta en la cadena sbPassword del tamaño
		// de longitud
		for (int i = 0; i < longitud; i++) {
			int caracterAle = rnd.nextInt(caracteres.length());
			sbPassword.append(caracteres.charAt(caracterAle));
		}

		return sbPassword.toString();
	}

	/**
	 * Retorna con true o false si la contraseña es lo suficiente segura y cumple
	 * con los requisitos de seguridad
	 *
	 * @return si la contraseña es true o false
	 */
	public boolean esFuerte() {
		// Atributos
		int contadorMayusculas = 0;
		int contadorMinusculas = 0;
		int contadorNumeros = 0;

		// Itera en cada caracter de la contraseña y comprueba que los caracteres
		// contengan
		// mayúsculas, minúsculas y números. Si es asi los va sumando en us contadores.
		for (int i = 0; i < contrasena.length(); i++) {
			char caracterPass = contrasena.charAt(i);

			if (Character.isUpperCase(caracterPass)) {
				contadorMayusculas++;
			} else if (Character.isLowerCase(caracterPass)) {
				contadorMinusculas++;
			} else if (Character.isDigit(caracterPass)) {
				contadorNumeros++;
			}
		}

		return contadorMayusculas > 2 && contadorMinusculas > 1 && contadorNumeros > 5;
	}
}
