
package exercicio;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoa {
    
// retorna true se estiver ok, ou false se ouve algo errado
    public boolean validar(Pessoa pessoa){
        // FAZER AS VALIDACOES AQUI DENTRO 
         boolean ret = true;
         
        // EXEMPLO, validacao de uma parte do campo NOME
        if(pessoa.getNome().equals("")){
            ret = false;
        }
        return ret;
    }
    
    
}
