import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora c;
	
	int expected, actual;
	
	@Before
	public void setUp() {
		this.c = new Calculadora();
	}
	
	@Test
	public void testeSomar() {
		this.expected = 5;				
		this.actual = c.somar(2, 3);
		
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testeSubtrair() {
		this.expected = 3;
		this.actual = c.subtrair(10, 7);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testeMultiplicar() {
		this.expected = 45;
		this.actual = c.multiplicar(5,9);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testeDividir() {
		this.expected = 4;
		this.actual = c.dividir(12, 3);
		
		assertEquals(expected, actual);
	}
	
}