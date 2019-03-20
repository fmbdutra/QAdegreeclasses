import org.junit.Assert;
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
public class BancoTest {
    @Test
    public void testeValidoTaxaJurosValidos(){
        Banco banco = new Banco();
        Assert.assertEquals(true, banco.eValidoTaxaJuros(5));
         Assert.assertEquals(true, banco.eValidoTaxaJuros(20));
    }
     @Test
    public void testeValidoTaxaJurosInValidos(){
        Banco banco = new Banco();
        Assert.assertEquals(false, banco.eValidoTaxaJuros(4.99f));
         Assert.assertEquals(false, banco.eValidoTaxaJuros(20.01f));
    }
    
}
