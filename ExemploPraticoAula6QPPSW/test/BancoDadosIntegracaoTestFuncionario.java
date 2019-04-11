/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exemplopraticoaula6qppsw.BancoDados;
import exemplopraticoaula6qppsw.Funcionario;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author fabiano.dutra
 */
public class BancoDadosIntegracaoTestFuncionario {
    
    private BancoDados banco;
    
    @Before
    public void init(){
        banco = new BancoDados();
    }
    
    @Test
    public void testInsert(){
        Funcionario f = new Funcionario();
        f.setSetor("TI");
        f.setNome("joão");
        banco.insertFuncionario(f);
        
        int id = f.getId();
        
        Funcionario funcBanco = banco.buscaFuncionario(id);
        
        assertNotNull(funcBanco);
    }
    
     @Test
    public void testDelete(){
        Funcionario f = new Funcionario();
        f.setSetor("TI");
        f.setNome("pedro");
        banco.insertFuncionario(f);
       
        int id = f.getId();
        banco.deletePessoa(id);
        assertNull(banco.buscaPessoa(id));
    }
    
    @Test
    public void testUpdate(){
//        Funcionario f = new Funcionario();
//        f.setSetor("TI");
//        f.setNome("maria");
//        int id = banco.insertFuncionario(f);
//
//        f.setSetor("comercial");
//        banco.updateFuncionario(f);
//        f = banco.buscaFuncionario(id);
//        
//         assertEquals("comercial", f.getSetor());
    
    Funcionario f = new Funcionario();
    f.setNome("mateus");
    f.setSetor("RH");
    banco.insertFuncionario(f);
    
    String novo = "vitor";
    f.setNome(novo);
    banco.updateFuncionario(f);
    
    List<Funcionario> lista = banco.listFuncionario();
    boolean encontrou = false;
    for(Funcionario fun : lista){
       if(f.getNome().equals(novo)){
           encontrou = true;
       }
    }
    
    if (encontrou == false){
        Assert.fail();
    }
    

    }
    
    @Test
    public void testListFuncionrio(){
        Funcionario f = new Funcionario();
        f.setSetor("TI");
        f.setNome("jesus");
        banco.insertFuncionario(f);
        
        assertTrue(banco.listFuncionario().size() > 0);

    }
}
