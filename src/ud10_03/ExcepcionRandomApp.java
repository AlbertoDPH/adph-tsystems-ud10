package ud10_03;

import java.util.Random;
import pkgExcepcionCustom.ExcepcionCustom;

public class ExcepcionRandomApp {

	public static void main(String[] args) {
		
		//Instanciamos objeto clase Random
		Random rnd = new Random();

		//Vector con dos posiciones
		String[] par_impar = { "par", "impar" };
		//Recoge el valor si es par o impar
		String valor = "";
		//Recoge número aleatorio entre 0 y 999
		int numAlea = rnd.nextInt(999);				
		
		//Comprueba si el número alaetorio es par o impar
		if (numAlea % 2 == 0)
			valor = par_impar[0];
		else
			valor = par_impar[1];

		//Instanciamos objeto que controla excepciones personalizadas
		@SuppressWarnings("unused")
		ExcepcionCustom numRandom = new ExcepcionCustom("El número aleatorio generado " + numAlea + " es " + valor);
	}

}
