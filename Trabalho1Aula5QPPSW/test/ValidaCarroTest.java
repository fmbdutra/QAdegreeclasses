import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidaCarroTest {
    
    @Test
    public void testValidaValorTotalErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        //Testa valores inválidos
        c.setValorTotal(0);
        Assert.assertFalse(v.validaValorTotal(c));
        c.setValorTotal(50001);
        Assert.assertFalse(v.validaValorTotal(c));
    }
    
    @Test
    public void testValidaValorTotalOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        //Testa valores válidos
        c.setValorTotal(1);
        Assert.assertTrue(v.validaValorTotal(c));
        c.setValorTotal(2);
        Assert.assertTrue(v.validaValorTotal(c));
        c.setValorTotal(50000);
        Assert.assertTrue(v.validaValorTotal(c));
        c.setValorTotal(49999);
        Assert.assertTrue(v.validaValorTotal(c));
    }
    
    @Test
    public void testValidaNomeProprietarioErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setNomeProprietario("");
        Assert.assertFalse(v.validaNomeProprietario(c));
        c.setNomeProprietario("12345678912345679812345678");
        Assert.assertFalse(v.validaNomeProprietario(c));
    }
    
    @Test
    public void testValidaNomeProprietarioOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setNomeProprietario("Mateus");
        Assert.assertTrue(v.validaNomeProprietario(c));
    }
    
    @Test
    public void testValidaAnoFabricacaoErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setAnoFabricacao(1979);
        Assert.assertFalse(v.validaAnoFabricacao(c));
    }
    
    @Test
    public void testValidaAnoFabricacaoOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setAnoFabricacao(1980);
        Assert.assertTrue(v.validaAnoFabricacao(c));
        c.setAnoFabricacao(1981);
        Assert.assertTrue(v.validaAnoFabricacao(c));
    }
    
    @Test
    public void testValidaPlacaErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setPlaca("IMZ5141");
        Assert.assertFalse(v.validaPlaca(c));
        c.setPlaca("IMZ--5141");
        Assert.assertFalse(v.validaPlaca(c));
    }
    
    @Test
    public void testValidaPlacaOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setPlaca("IMZ-5141");
        Assert.assertTrue(v.validaPlaca(c));
    }
    
    @Test
    public void testValidaMarcaErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setMarca("...");
        Assert.assertFalse(v.validaMarca(c));
    }
    
    @Test
    public void testValidaMarcaOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setMarca("VW");
        Assert.assertTrue(v.validaMarca(c));
        c.setMarca("GM");
        Assert.assertTrue(v.validaMarca(c));
    }
    
    @Test
	public void testValidaFinanciamentoOk() {
            ValidaCarro v = new ValidaCarro();
            Carro carro = new Carro();
		
            carro.seteFinanciado(true);
            carro.setValorTotal(50000);
            carro.setValorFinanciamento(5000);
		
            Assert.assertTrue(v.validaValorFinanciamento(carro));
		
	}
	
	@Test
	public void testValidaFinanciamentoErr() {
            ValidaCarro v = new ValidaCarro();
            Carro carro = new Carro();
	
            carro.seteFinanciado(true);
            carro.setValorTotal(20000);
            carro.setValorFinanciamento(50000);
		
            Assert.assertFalse(v.validaValorFinanciamento(carro));
	}
    
    @Test
    public void testValidaCodigoErr(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setCodigo(0);
        Assert.assertFalse(v.validaCodigo(c));
    }
    
    @Test
    public void testValidaCodigoOk(){
        Carro c = new Carro();
        ValidaCarro v = new ValidaCarro();
        c.setCodigo(1);
        Assert.assertTrue(v.validaCodigo(c));
        c.setCodigo(100);
        Assert.assertTrue(v.validaCodigo(c));
    }
}