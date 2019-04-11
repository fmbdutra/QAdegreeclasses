/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopraticoaula6qppsw;

import java.util.List;

/**
 *
 * @author marcelo.soares
 */
 
import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import java.sql.SQLException;
import java.util.ArrayList;

public class BancoDados {
    private Connection connection = null;  
    
public BancoDados(){
    conectaBanco();
}
    
 
//Método de Conexão//
 
private void conectaBanco() { 
           
    try {
    String driverName = "com.mysql.jdbc.Driver";
    Class.forName(driverName); 
    String serverName = "localhost";   
    String mydatabase ="senai"; 
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String username = "root";  
    String password = "1@asdfg";   
    connection = DriverManager.getConnection(url, username, password); 
    if (connection != null) {
        System.out.println("STATUS--->Conectado com sucesso!");
    } else {
        System.out.println("STATUS--->Não foi possivel realizar conexão");
    }
    } catch (Exception e) {  
        System.out.println("Error ao conectar o banco de dados");
        e.printStackTrace();
    } 
 
  
 
    }
    
    public int insertPessoa(Pessoa p){
        String sql = "insert into pessoa (nome,idade) value('"+
                p.getNome() + "','"+ p.getIdade() + "')";
     
        System.out.println("sql insert " + sql);
        
        try{
            connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery("SELECT LAST_INSERT_ID()");
            if (resultSet.next()) {
                int id =   resultSet.getInt("LAST_INSERT_ID()");
                p.setId(id);
                return id;
            }else{
                return -1;
            }
           
           
        }catch(Exception e){
            System.out.println("Error na insercao pessoa " + e);
            return -1;
        }
                
    }
    
    public boolean deletePessoa(int id){
        String sql = "delete from  pessoa where idpessoa = "+ id;
        System.out.println("sql delete " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na remocao pessoa " + e);
            return false;
        }
        
        return true;
    }
    
    public boolean updatePessoa(Pessoa p){
        String sql = "update  pessoa set nome = '" + p.getNome() 
                + "', idade = " + p.getIdade() + " where idpessoa = " + p.getId() ;
              
        System.out.println("sql update " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na update pessoa " + e);
            return false;
        }
        
        return true;
    }
    
    public List<Pessoa> listPessoa(){
        List<Pessoa> lista = new ArrayList<>();
        String sql = "select * from pessoa";
        System.out.println("sql select " + sql);
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            Pessoa pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("idpessoa"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setIdade(resultSet.getInt("idade"));
            lista.add(pessoa);
         }    
             
        }catch(Exception e){
            
        }
        
        return lista;
    }
    
     public Pessoa  buscaPessoa(int idPessoa){
       
        String sql = "select * from pessoa where idpessoa =" + idPessoa;             ;
        System.out.println("sql select " + sql);
         Pessoa pessoa = null;
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
             pessoa = new Pessoa();
            pessoa.setId(resultSet.getInt("idpessoa"));
            pessoa.setNome(resultSet.getString("nome"));
            pessoa.setIdade(resultSet.getInt("idade"));
            
         }    
             
        }catch(Exception e){
            
        }
        
        return pessoa;
    }
//-------------------------     
     //-------------------------     
     //-------------------------     
     //-------------------------     
     //-------------------------     
     //-------------------------     
     public int insertFuncionario(Funcionario f){
        String sql = "insert into funcionario (nome,setor) value('"+
                f.getNome() + "','"+ f.getSetor() + "')";
     
        System.out.println("sql insert " + sql);
        
        try{
            connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery("SELECT LAST_INSERT_ID()");
            if (resultSet.next()) {
                int id =   resultSet.getInt("LAST_INSERT_ID()");
                f.setId(id);
                return id;
            }else{
                return -1;
            }
           
           
        }catch(Exception e){
            System.out.println("Error na insercao pessoa " + e);
            return -1;
        }
                
    }
    
    public boolean deleteFuncionario(int id){
        String sql = "delete from  funcionario where id = "+ id;
        System.out.println("sql delete " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na remocao funcionario " + e);
            return false;
        }
        
        return true;
    }
    
    public boolean updateFuncionario(Funcionario f){
        String sql = "update  funcionario set nome = '" + f.getNome() 
                + "', setor = '" + f.getSetor() + "' where id = " + f.getId() ;
              
        System.out.println("sql update " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na update funcionario " + e);
            return false;
        }
        
        return true;
    }

    public List<Funcionario> listFuncionario(){
        List<Funcionario> lista = new ArrayList<>();
        String sql = "select * from funcionario";
        System.out.println("sql select " + sql);
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            Funcionario funcionario = new Funcionario();
            funcionario.setId(resultSet.getInt("id"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setSetor(resultSet.getString("setor"));
            lista.add(funcionario);
         }    
             
        }catch(Exception e){
            
        }
        
        return lista;
    }
    
     public Funcionario  buscaFuncionario(int idFuncionario){
       
        String sql = "select * from funcionario where id =" + idFuncionario;             ;
        System.out.println("sql select " + sql);
         Funcionario funcionario = null;
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            funcionario = new Funcionario();
            funcionario.setId(resultSet.getInt("id"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setSetor(resultSet.getString("setor"));
            
         }    
             
        }catch(Exception e){
            
        }
        
        return funcionario;
    }
     
 //-----------------------------------------------
     //-------------------------------------------
     //-------------------------------------------//
     //------------------------------------------
     
     public int insertCona(Conta c){
        String sql = "insert into conta (nomeCorrentista,saldo) value('"+
                c.getNomeCorrentista() + "',"+ c.getSaldo()+ ")";
     
        System.out.println("sql insert " + sql);
        
        try{
            connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery("SELECT LAST_INSERT_ID()");
            if (resultSet.next()) {
                int id =   resultSet.getInt("LAST_INSERT_ID()");
                c.setId(id);
                return id;
            }else{
                return -1;
            }
           
           
        }catch(Exception e){
            System.out.println("Error na insercao conta " + e);
            return -1;
        }
                
    }
    
    public boolean deleteConta(int id){
        String sql = "delete from  conta where id = "+ id;
        System.out.println("sql delete " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na remocao conta " + e);
            return false;
        }
        
        return true;
    }
    
    public boolean updateConta(Conta c){
        String sql = "update  pessoa set nomeCorrentista = '" + c.getNomeCorrentista()
                + "', saldo = " + c.getSaldo()+ " where id = " + c.getId() ;
              
        System.out.println("sql update " + sql);
        
        try{
            connection.createStatement().execute(sql);
        }catch(Exception e){
            System.out.println("Error na update conta " + e);
            return false;
        }
        
        return true;
    }
    
    public List<Conta> listConta(){
        List<Conta> lista = new ArrayList<>();
        String sql = "select * from conta";
        System.out.println("sql select " + sql);
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            Conta conta = new Conta();
            conta.setId(resultSet.getInt("id"));
            conta.setNomeCorrentista(resultSet.getString("nomeCorrentista"));
            conta.setSaldo(resultSet.getFloat("saldo"));
            lista.add(conta);
         }    
             
        }catch(Exception e){
            
        }
        
        return lista;
    }
    
     public Pessoa  buscaConta(int id){
       
        String sql = "select * from conta where id =" + id;             ;
        System.out.println("sql select " + sql);
         Pessoa pessoa = null;
        try{
        connection.createStatement().execute(sql);
             ResultSet resultSet = connection.createStatement().
                     executeQuery(sql);
          
         while(resultSet.next()){
            Conta conta = new Conta();
            conta.setId(resultSet.getInt("id"));
            conta.setNomeCorrentista(resultSet.getString("nomeCorrentista"));
            conta.setSaldo(resultSet.getFloat("saldo"));
            
         }    
             
        }catch(Exception e){
            
        }
        
        return pessoa;
    }
     
     
}
