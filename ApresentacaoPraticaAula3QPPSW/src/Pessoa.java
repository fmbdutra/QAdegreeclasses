/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo.soares
 */
public class Pessoa {
    
    int idade;
    
    public boolean adicionaIdade(int i){
        if(i <=0 || i > 100){
            return false;
        }
        idade = i;
        return true;
    }
}
