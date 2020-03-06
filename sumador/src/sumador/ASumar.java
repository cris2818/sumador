package sumador;

/**
 * Clase para sumar los d�gitos que componen un n�mero
 * @author Cristina
 * @version: 1.0
 */
public class ASumar {
	
	int valor;
	/**
	 * Constructor de la clase con par�metros
	 * @param i n�mero a sumar
	 */
	public ASumar(int i) {
		valor = i;
	}

	/**
	 * M�todo para mostrar el resultado de la suma de todos los d�gitos que componen un n�mero
	 * @param cad cadena que contiene el n�mero que se va a sumar
	 * @return devuelve una cadena donde muestra el n�mero introducido y el resultado de sumar sus d�gitos
	 */
	public String mostrar(String cad) {
		String numero = cad;
		String cadvalor = Integer.toString(valor);
	
		if(cadvalor.charAt(0) == '-')					
			return null;	

		return numero + " = " + valor;
	}

}

