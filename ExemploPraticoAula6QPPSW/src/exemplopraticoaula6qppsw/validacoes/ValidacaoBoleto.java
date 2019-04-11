/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopraticoaula6qppsw.validacoes;

import exemplopraticoaula6qppsw.Boleto;

/**
 *
 * @author fabiano.dutra
 */
public class ValidacaoBoleto {
    public Boleto boleto;
    
    public boolean Valida(Boleto boleto)  {
    
    boolean ret = true;
    
    if(boleto.getIdBoleto() < 0){
        ret = false;
    }
    
    if(boleto.getValor()<1){
        ret = false;
    }
    
    if(boleto.getSacado().isEmpty() || boleto.getSacado().equals("")){
        ret = false;
    }
    
    return ret;
}
    
}
