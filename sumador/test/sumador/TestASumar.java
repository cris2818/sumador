package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Clase JUnit para realizar los test de pruebas
 * @author Cristina
 * @version: 1.0
 * 
 */
public class TestASumar {

	/**
	 * Test para un número de un sólo dígito
	 */
	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar(5);
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
    }
	
	/**
	 * Test para un número negativo
	 */
	@Test
	public void testValorNegativo() {
		ASumar sumi = new ASumar(-12);
		String resultado = sumi.mostrar("-12");
		assertNull(resultado);
	}

	/**
	 * Test para más de un dígito
	 * 
	 */
	@Test 
	public void testMasDeUnDigito() {
		 ASumar sumi = new ASumar(3433);
	     String resultado = sumi.mostrar("3433");
	     assertEquals("3433 = 3+4+3+3=13",resultado );
		
	}
}
