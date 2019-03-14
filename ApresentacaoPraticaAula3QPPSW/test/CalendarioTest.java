import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalendarioTest {
		
	private Calendario calendario;
	private boolean actual;

	@Before
	public void setUp(){
		calendario = new Calendario();
	}
	
	@Test
	public void testeValidaMesCorreto() {
		
		this.actual = calendario.validaMes(3);
		
		assertTrue(actual);
	}
	
	@Test
	public void testeValidaMesInvalidoMaiorQueDoze() {
		this.actual = calendario.validaMes(13);
		
		assertFalse(actual);
	}
	
	@Test
	public void testeValidaMesInvalidoMenorQueZero() {
		this.actual = calendario.validaMes(-1);
		
		assertFalse(actual);
	}	
	
	@Test
	public void testeValidaDiasDoMes() {
		this.actual = calendario.ValidaDiasDoMes(30, 1);
		
		assertTrue(actual);
	}
	
	@Test
	public void testeValidaDiasDoMesComTrintaEUm() {
		this.actual = calendario.ValidaDiasDoMes(31, 8);
		
		assertFalse(actual);
	}

	
	@Test
	public void testeValidaDiasDoMesFevereiro() {
		this.actual = calendario.ValidaDiasDoMes(30, 2);
		
		assertFalse(actual);
	}

}
