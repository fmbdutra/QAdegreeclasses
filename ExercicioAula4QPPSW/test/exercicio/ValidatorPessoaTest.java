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
import org.junit.Test;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {

	public Pessoa p, pessoaPerfeita;
	public ValidatorPessoa v;

	private Pessoa criaPessoa() {
		pessoaPerfeita = new Pessoa();
		pessoaPerfeita.setNome("joao");
		pessoaPerfeita.setEndereco("rua x");
		pessoaPerfeita.setDataNascimentoDia("10");
		pessoaPerfeita.setDataNascimentoAno("2000");
		pessoaPerfeita.setDataNascimentoMes("12");
		pessoaPerfeita.setDddTelefone("51");
		pessoaPerfeita.setTelefone("1234567");
		pessoaPerfeita.setSexo("m");
		pessoaPerfeita.setNumeroEndereco("123");
		return pessoaPerfeita;
	}
	
	@Before
	public void setUp() {
		v = new ValidatorPessoa();
		p = criaPessoa();
	}


	@Test
	public void testePessoaPerfeita() {
		Assert.assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaNomeOk() {
		p.setNome("Fabiano");
		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaNomeErroVazio() {
		p.setNome("");
		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaNomeErroTamanho() {

		p.setNome("aaaaaaaaaa" + "aaaaaaaaaa" + "aaaaaaaaaaaaa");
		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaEnderecoOk() {
		p.setEndereco("Av. Aula 10, Faculdade SENAI");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaEnderecoErroTamanho() {
		p.setEndereco("Avenida Aula 10, Faculdade SENAI - Porto Alegre, RS - Brasil");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaEnderecoErroVazio() {
		p.setEndereco("");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaTelefoneOk() {
		p.setTelefone("33416560");
		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaTelefoneErroTamanho() {
		p.setTelefone("3488923748327984729847298");
		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaTelefoneErroVazio() {
		p.setTelefone("");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDDDOk() {
		p.setTelefone("51");

		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaDDDErroTamanhoMaior() {
		p.setTelefone("051");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDDDErroTamanhoMenor() {
		p.setTelefone("1");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDDDErroNaoNumero() {
		p.setTelefone("ab");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDDDErroVazio() {
		p.setTelefone("");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaNascimentoDiaOk() {
		p.setDataNascimentoDia("27");

		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaNascimentoDiaErroTamanho() {
		p.setDataNascimentoDia("051");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaNascimentoDiaErroNaoNumero() {
		p.setDataNascimentoDia("ab");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDiaEntre1e30() {
		p.setDataNascimentoDia("51");

		assertFalse(v.validar(p));
	}
	// ---------------
	// Teste Nascimento Mes

	@Test
	public void testeValidaNascimentoMesOk() {
		p.setDataNascimentoDia("09");

		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaNascimentoMesErroNaoNumero() {
		p.setDataNascimentoDia("ab");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaMesEntre1e12() {
		p.setDataNascimentoDia("13");

		assertFalse(v.validar(p));
	}
	// ----------------------
	// Teste Ano Nascimento

	@Test
	public void testeValidaNascimentoAnoOk() {
		p.setDataNascimentoDia("1985");
		assertTrue(v.validar(p));
	}

	@Test
	public void testeValidaNascimentoAnoErroNaoNumero() {
		p.setDataNascimentoDia("abaaa");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDiaAnterior1900() {
		p.setDataNascimentoDia("1800");

		assertFalse(v.validar(p));
	}

	@Test
	public void testeValidaDiaMaiorAnoAtual() {
		p.setDataNascimentoDia("2060");
		// Ano atual = 2019

		assertFalse(v.validar(p));
	}
}
