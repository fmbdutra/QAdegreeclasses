/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {

	private Pessoa criaPessoa() {
		Pessoa pessoa = new Pessoa();
        pessoa.setNome("joao");
        pessoa.setEndereco("rua x");
        pessoa.setDataNascimentoDia("10");
        pessoa.setDataNascimentoAno("2000");
        pessoa.setDataNascimentoMes("12");
        pessoa.setDddTelefone("51");
        pessoa.setTelefone("1234567");
        pessoa.setSexo("m");
        pessoa.setNumeroEndereco("123");
        return pessoa;
	}
	
	@Test
    public void testvalidaNomeOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = criaPessoa();
        pessoa.setNome("teste");
        pessoa.setNome("012345678901234567890123456789");
        Assert.assertTrue(validator.validar(pessoa));
    }

}
