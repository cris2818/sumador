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
	 * Método para presentar el resultado en forma de sumandos
	 * @param cadvalor
	 * @param sumaTotal
	 * @return devuelve la suma de los dígitos como sumandos y el resultado de la suma
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
	 * Método que realiza la suma de los dígitos
	 * @param valor_inicial numero a sumar
	 * @return devuelve el resultado de la suma de los dígitos
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

