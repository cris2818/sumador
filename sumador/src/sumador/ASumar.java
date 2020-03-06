package sumador;

/**
 * Clase para sumar los dígitos que componen un número
 * @author Cristina
 * @version: 1.0
 */
public class ASumar {
	
	int valor;
	/**
	 * Constructor de la clase con parámetros
	 * @param i número a sumar
	 */
	public ASumar(int i) {
		valor = i;
	}

	/**
	 * Método para mostrar el resultado de la suma de todos los dígitos que componen un número
	 * @param cad cadena que contiene el número que se va a sumar
	 * @return devuelve una cadena donde muestra el número introducido y el resultado de sumar sus dígitos
	 */
	public String mostrar(String cad) {
		String numero = cad;
		String cadvalor = Integer.toString(valor);
	
		if(cadvalor.charAt(0) == '-')					
			return null;	

		return numero + " = " + valor;
	}

}

