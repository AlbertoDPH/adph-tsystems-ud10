package pkgExcepcionCustom;

import javax.swing.JOptionPane;

/**
 * Clase que a traves de su constructor lanza una excepción personalizada, el
 * mensaje se pasa por parametro
 * 
 * @author Alberto
 *
 */
@SuppressWarnings("serial")
public class ExcepcionCustom extends Exception {

	public ExcepcionCustom(String message) {
		/*
		 * Llamamos al constructor de la clase padre (Exception) y le pasamos por
		 * parámetro el mensaje
		 */
		super(message);

		/**
		 * Constructor personalizado Si se lanza la excepción, le pasaremos por
		 * parámetro el mensaje de error personalizado
		 */

		JOptionPane.showMessageDialog(null, "Se esta lanzando una Exception\nExcepción capturada con mensaje:\n "
				+ message + "\n Programa terminado");
	}
}
