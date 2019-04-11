
import exemplopraticoaula6qppsw.BancoDados;
import exemplopraticoaula6qppsw.Boleto;
import exemplopraticoaula6qppsw.Funcionario;
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
        private BancoDados banco;
    
    @Before
    public void init(){
        banco = new BancoDados();
    }
    
    @Test
    public void testBoletoNaoPodeReceberValoresNegativos(){
        Boleto b = new Boleto();
        b.setValor(-20);
        b.setSacado("Mateus Spaguete");
        banco.insertBoleto(b);
        
        int id = b.getIdBoleto();
        
        Boleto boletoBanco = banco.buscaBoleto(id);
        
        Assert.fail();        
    }
    
    
}
