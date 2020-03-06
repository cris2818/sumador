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
		int sumaTotal=0;
		
		if(cadvalor.charAt(0) == '-')					
			return null;	
		
		if (numero.length() == 1)
			return (numero + " = " + valor);
		
		sumaTotal = total(Integer.toString(valor));
		
		String resultado = presentacion(cadvalor, sumaTotal);
		
		return numero + " = " + resultado;		
	}
	
	/**
	 * M�todo para presentar el resultado en forma de sumandos
	 * @param cadvalor
	 * @param sumaTotal
	 * @return devuelve la suma de los d�gitos como sumandos y el resultado de la suma
	 */
	public String presentacion(String cadvalor, int sumaTotal) {
		String resultado="";
		for(int i=0; i<cadvalor.length(); i++)
		{
			if(i == cadvalor.length()-1){
				resultado = resultado + cadvalor.substring(i,i+1) + '=' + sumaTotal;
			}
			else {
				resultado = resultado + cadvalor.substring(i,i+1) + '+';
			}
		}
		return resultado;
	}
	
	 /**
	 * M�todo que realiza la suma de los d�gitos
	 * @param valor_inicial numero a sumar
	 * @return devuelve el resultado de la suma de los d�gitos
	 */
	public int total(String valor_inicial) {
	        int suma = 0;
	      	for (int i = 0; i < valor_inicial .length(); i++) {
	            String digito = valor_inicial.substring(i, i+1);
	            suma = suma + Integer.parseInt(digito);	          
	        }
		    return suma;
	}

}

