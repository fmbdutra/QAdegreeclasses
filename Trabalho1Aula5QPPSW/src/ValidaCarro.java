
import java.util.Optional;

// classe para validar as regras de negocio do carro
public class ValidaCarro {
    
    // carro tiver algum erro naa validacao, gerar uma excessao 
    //com a mensagem do que foi problema
    public void validaCarro(Carro carro) throws Exception{
        if(carro.getValorFinanciamento() > carro.getValorTotal() ){
            throw  new Exception("O valor financiado não pode ser maior que o valor total");
        }
        // EXEMPLO FICTICIO (não descomente, pois vai gerar erro de compilacao
        //if(carro.getValor() > XXX ){
        //   throw  new Exception("Ocorreu o erro no valor XXX");
        //}
    }
    
    public boolean validaValorTotal(Carro c){
        boolean ret = true;
        if(c.getValorTotal() < 1 || c.getValorTotal() >50000){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaNomeProprietario(Carro c){
        boolean ret = true;
        if(c.getNomeProprietario().equals("") || c.getNomeProprietario().length() > 25){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaAnoFabricacao(Carro c){
        boolean ret = true;
        if(c.getAnoFabricacao() < 1980){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaPlaca(Carro c){
        boolean ret = true;
        if(c.getPlaca().length() != 8){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaMarca(Carro c){
        boolean ret = true;
        if(c.getMarca().equals("...")){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaValorFinanciamento(Carro c){
        boolean ret = true;
        if(c.iseFinanciado() == true && (c.getValorFinanciamento()<1 || c.getValorFinanciamento() > c.getValorTotal())){
            ret = false;
        }
        return ret;
    }
    
    public boolean validaCodigo(Carro c){
        boolean ret = true;
        if(c.getCodigo() < 1){
            ret = false;
        }
        return ret;
    }
}