import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testeValida() {
		//ENTRADA
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("joao");
		pessoa.setSalario(12000);
		//PROCESSAMENTO
		boolean ret = Main.validaPessoa(pessoa);
		//SAÍDA ESPERADA
		boolean expected =  false;
		//CHAMADA DO TESTE - COMPARACÃO DO RETORO DA FUNÇÃO
		//COM A SAÍDA ESPERADA
		assertEquals(expected, ret);		
	}
}
