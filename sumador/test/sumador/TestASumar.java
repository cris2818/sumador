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

}
