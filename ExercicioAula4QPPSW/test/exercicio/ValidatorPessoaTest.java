/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {

	Pessoa pessoa;
	ValidatorPessoa validator;

	@Before
	public void setUp() {
		this.validator = new ValidatorPessoa();
		this.pessoa = new Pessoa();
	}

	@Test
	public void testeValidaNomeOk() {
		pessoa.setNome("teste");
		Assert.assertTrue(validator.validar(pessoa));
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
    public void testeValidaDDDErroTamanho() {
		pessoa.setTelefone("051");
		
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
}
