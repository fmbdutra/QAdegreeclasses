
import exemplopraticoaula6qppsw.BancoDados;
import exemplopraticoaula6qppsw.Boleto;
import exemplopraticoaula6qppsw.Funcionario;
import exemplopraticoaula6qppsw.validacoes.ValidacaoBoleto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiano.dutra
 */
public class BancoDeDadosIntegracaoBoletoTest {
   
    public ValidacaoBoleto v;
    public Boleto b;
    
    @Before
    public void setUp(){
        v = new ValidacaoBoleto();
        b = new Boleto();
        
        b.setIdBoleto(1);
        b.setSacado("Matheus");
        b.setValor(500);
    }
    
    @Test
    public void testBoletoNaoPodeReceberValoresNegativos(){
      b.setValor(-50);
        
        Assert.assertFalse(v.Valida(b));
    }
    
    
}
