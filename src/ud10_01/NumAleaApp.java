package ud10_01;

import javax.swing.JOptionPane;

public class NumAleaApp {
	public static void main(String[] args) {
		// Atributos
		int numAleaGenerado;
		int numUsuario = 0;
		boolean hasAcertado = false;

		// Instaciamos el objeto numAlea
		NumAleatorio numAlea = new NumAleatorio();
		// Método que genera números aleatorios enteros entre 1 y 500
		numAleaGenerado = numAlea.generaNumAleatorio();

		// Mientras nos se acierte el número lo seguira pidiendo
		while (!hasAcertado) {
			// Controla que no sea un valor entero el que se introduce
			try {
				// Se pide el número por ventana emergente y se almacena en numUsuario
				numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce num:"));
				// LLama al método comprubaNumAlea y el resultado lo almacena en hasAcertado
				hasAcertado = numAlea.compruebaNumAlea(numAleaGenerado, numUsuario);

			}
			// Si no es número entero, lanza excepción personalizada en una ventana
			// emergente
			// Además incrementa el número de intentos.
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Datos incorreptos" + "\nDebes introducir un número", "Error", 0);
				numAlea.setIntentos(numAlea.getIntentos() + 1);

			}
		}
	}
}
