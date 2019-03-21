/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {

	private Pessoa pessoa = new Pessoa();
	private ValidatorPessoa validator = new ValidatorPessoa();
	
	private Pessoa criaPessoa() {
		pessoa.setNome("nome");
		pessoa.setDataNascimentoAno("1995");
		pessoa.setDataNascimentoDia("25");
		pessoa.setDataNascimentoMes("02");
		pessoa.setDddTelefone("51");
		pessoa.setEndereco("Avenida Testes");
		pessoa.setNumeroEndereco("532");
		pessoa.setSexo("m");
		pessoa.setTelefone("33406767");
				
		return pessoa;
	}
	
	@Before
	public void setUp() {
		criaPessoa();
	}

	@Test
	public void testeValidaNomeOk() {
		this.pessoa.setNome("teste");
		Assert.assertTrue(this.validator.validar(this.pessoa));
	}

	@Test
	public void testeValidaNomeErroVazio() {
		pessoa.setNome("");
		Assert.assertFalse(validator.validar(pessoa));
	}

	@Test
	public void testeValidaNomeErroTamanho() {

		pessoa.setNome("aaaaaaaaaa" + "aaaaaaaaaa" + "aaaaaaaaaaaaa");
		Assert.assertFalse(validator.validar(pessoa));
	}

	@Test
	public void testeValidaEnderecoOk() {
		pessoa.setEndereco("Av. Aula 10, Faculdade SENAI");

		assertTrue(validator.validar(pessoa));
	}

	@Test 
    public void testeValidaEnderecoErroTamanho() {
		pessoa.setEndereco("Avenida Aula 10, Faculdade SENAI - Porto Alegre, RS - Brasil");
    	
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test
	public void testeValidaEnderecoErroVazio() {
		pessoa.setEndereco("");
    	
    	assertFalse(validator.validar(pessoa));
	}
	
	@Test 
	public void testeValidaTelefoneOk() {
		pessoa.setTelefone("33416560");
		
		assertTrue(validator.validar(pessoa));
	}
	
	@Test 
    public void testeValidaTelefoneErroTamanho() {
		pessoa.setTelefone("3488923748327984729847298");
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test
	public void testeValidaTelefoneErroVazio() {
		pessoa.setTelefone("");
    	
    	assertFalse(validator.validar(pessoa));
	}
	
	@Test 
	public void testeValidaDDDOk() {
		pessoa.setTelefone("51");
		
		assertTrue(validator.validar(pessoa));
	}
	
	@Test 
    public void testeValidaDDDErroTamanhoMaior() {
		pessoa.setTelefone("051");
		
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test 
    public void testeValidaDDDErroTamanhoMenor() {
		pessoa.setTelefone("1");
		
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test
	public void testeValidaDDDErroNaoNumero() {
		pessoa.setTelefone("ab");
		
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test
	public void testeValidaDDDErroVazio() {
		pessoa.setTelefone("");
    	
    	assertFalse(validator.validar(pessoa));
	}
	
	@Test 
	public void testeValidaNascimentoDiaOk() {
		pessoa.setDataNascimentoDia("27");
		
		assertTrue(validator.validar(pessoa));
	}
	
	@Test 
    public void testeValidaNascimentoDiaErroTamanho() {
		pessoa.setDataNascimentoDia("051");
		
    	assertFalse(validator.validar(pessoa));
    }
	
	@Test
	public void testeValidaNascimentoDiaErroNaoNumero() {
		pessoa.setDataNascimentoDia("ab");
		
    	assertFalse(validator.validar(pessoa));
    }
	
//	@Test
//	public void testeValidaDiaErroMaior30() {
//		
//	}
	
	
	
}
