import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TextoTest {
	private Texto t;
	private int actual, expected;
	
	@Before
	public void setUp() {
		this.t = new Texto();
	}
	
	@Test
	public void TesteRetornaTamanhoTextoValido() {
		this.actual = this.t.retornaTamanhoTexto("america");
		this.expected = 7;
		
		assertEquals(this.actual, this.expected);
		
	}
	
	@Test
	public void TesteRetornaTamanhoTextoInvalido() {
		this.actual = this.t.retornaTamanhoTexto("Maria");
		this.expected = 7;
		
		assertNotEquals(expected, actual);
		
	}
}
