/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoaTest {
    
   
    @Test
    public void testvalidaNomeOk(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("teste");
        Assert.assertTrue(validator.validar(pessoa));
    }
    
    @Test
    public void testvalidaNomeError(){
        ValidatorPessoa validator = new ValidatorPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("");
        Assert.assertFalse(validator.validar(pessoa));
    }
    
}
