
package exercicio;

import java.time.LocalDateTime;

/**
 *
 * @author marcelo.soares
 */
public class ValidatorPessoa {

// retorna true se estiver ok, ou false se ouve algo errado
	public boolean validar(Pessoa pessoa) {
		// FAZER AS VALIDACOES AQUI DENTRO
		boolean ret = true;

		// EXEMPLO, validacao de uma parte do campo NOME
		if (pessoa.getNome().equals("") || (pessoa.getNome().length() > 30)) {
			ret = false;
		} else if (pessoa.getEndereco().equals("") || pessoa.getEndereco().length() > 50) {
			ret = false;

		} else if (pessoa.getTelefone().equals("") || pessoa.getTelefone().length() > 20) {
			ret = false;

		} else if (!eNumber(pessoa.getDddTelefone()) 
				&& (pessoa.getDddTelefone().length() < 1 || pessoa.getDddTelefone().length() > 2)){

			ret = false;
			
		} else if (pessoa.getDataNascimentoDia().isEmpty() 
				|| (Integer.parseInt(pessoa.getDataNascimentoAno()) < 30
				|| Integer.parseInt(pessoa.getDataNascimentoAno()) > 30)) {

			ret = false;

		} else if (pessoa.getDataNascimentoMes().isEmpty() 
				|| (Integer.parseInt(pessoa.getDataNascimentoMes()) < 1
				|| Integer.parseInt(pessoa.getDataNascimentoMes()) > 12)) {
			ret = false;

		} else if (pessoa.getDataNascimentoAno().isEmpty() 
				|| (Integer.parseInt(pessoa.getDataNascimentoAno()) < 1900
				|| Integer.parseInt(pessoa.getDataNascimentoAno()) > LocalDateTime.now().getYear())) {
			ret = false;

		} else if (pessoa.getSexo().isEmpty() 
				|| pessoa.getSexo() != "m" 
				|| pessoa.getSexo() != "f") {
			ret = false;
		}

		return ret;
	}
	
	private boolean eNumber(String number) {
		boolean ret = true;
				
		try {
			Double.parseDouble(number);
		} catch (Exception e) {
			ret = false;
		}
		
		return ret;
	}

}
