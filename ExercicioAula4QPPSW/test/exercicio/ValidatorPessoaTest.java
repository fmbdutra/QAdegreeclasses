/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {
    
	Pessoa pessoa;
	ValidatorPessoa validator;
	
	@Before
	public void setUp(){
		this.validator = new ValidatorPessoa();
		this.pessoa = new Pessoa();
	}
	
    @Test
    public void testeValidaNomeOk(){   
        pessoa.setNome("teste");
        Assert.assertTrue(validator.validar(pessoa));
    }
    
    @Test
    public void testeValidaNomeErroVazio(){
        pessoa.setNome("");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
    @Test
    public void testeValidaNomeErroTamanho(){
        
    	pessoa.setNome("aaaaaaaaaa"
    			+ "aaaaaaaaaa"
    			+ "aaaaaaaaaaaaa");
        Assert.assertFalse(validator.validar(pessoa));
    }    
}
