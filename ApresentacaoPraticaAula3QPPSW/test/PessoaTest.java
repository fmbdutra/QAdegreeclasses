
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo.soares
 */
public class PessoaTest {
 
    
    @Test
    public void testAdicionaIdadeInvalidaMenorQueUm(){
        Pessoa pessoa = new Pessoa();       
        Assert.assertFalse(pessoa.adicionaIdade(-1));
    }
    
    @Test
    public void testAdicionaIdadeInvalidaMaiorQueCem(){
        Pessoa pessoa = new Pessoa();       
        Assert.assertFalse(pessoa.adicionaIdade(101));
    }
    
     @Test
    public void testAdicionaIdadeValida(){
        Pessoa pessoa = new Pessoa();       
        Assert.assertTrue(pessoa.adicionaIdade(1));
         Assert.assertTrue(pessoa.adicionaIdade(99));
    }
}
