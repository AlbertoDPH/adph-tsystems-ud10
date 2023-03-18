package ud10_02;

import pkgExcepcionCustom.ExcepcionCustom;

public class ExcepcionCustomApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Estanciamos objeto de la clase ExeptionCustom el cual controla una excepcion pesonalizable
		ExcepcionCustom miExcepcion = new ExcepcionCustom("Mensaje personalizado");

	}

}
