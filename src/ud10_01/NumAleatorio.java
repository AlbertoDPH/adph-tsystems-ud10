package ud10_01;

import javax.swing.JOptionPane;

public class NumAleatorio {

	// Atributos
	private int intentos;

	// Constructor por defecto
	public NumAleatorio() {
		this.intentos = 0;
	}

	/**
	 * Genera número aleatorio entre 1 y 500
	 * 
	 * @return devuelve el número aleatorio
	 */
	public int generaNumAleatorio() {
		return (int) (Math.random() * 500 + 1);
	}

	/**
	 * Compruba que el número introducido sea mayor menor o igual al aleatorio,
	 * mostrando mensajes emergentes según el caso.
	 * 
	 * @param numAlea    recibe número Aleatorio
	 * @param numUsuario recibe número introducido por teclado
	 * @return devuelve true si el número introducido es igual al aleatorio. O false
	 *         si no lo es.
	 */
	public boolean compruebaNumAlea(int numAlea, int numUsuario) {
		boolean acierto = false;

		// controla si numALea es más pequeño que numUsuario, incrementa los intentos y
		// devuelve false
		if (numAlea < numUsuario) {
			JOptionPane.showMessageDialog(null, "El número a encontrar es más pequeño");
			intentos++;
			acierto = false;
		}
		// controla si numALea es más grande que numUsuario, incrementa los intentos y
		// devuelve false
		else if (numAlea > numUsuario) {
			JOptionPane.showMessageDialog(null, "El número a encontrar es más grande");
			intentos++;
			acierto = false;
		}
		// controla si numALea es igual que numUsuario, incrementa los intentos y
		// devuelve true
		else {
			intentos++;
			JOptionPane.showMessageDialog(null, "Enhorabuena!!!" + "\nLo has adivinado en: " + intentos + " intentos");
			acierto = true;

		}
		// Devuelve si se ha aacertado con el nümero o no
		return acierto;
	}

	// Getters
	public int getIntentos() {
		return intentos;
	}

	// Setters
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

}
