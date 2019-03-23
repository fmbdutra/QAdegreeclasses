
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

		if (pessoa.getNome() != null && pessoa.getNome().equals("")) {
			ret = false;
			
		}else if(pessoa.getNome() != null && pessoa.getNome().length() > 30){
			ret = false;
			
		} else if (pessoa.getEndereco() != null
				&& (pessoa.getEndereco().equals("") || pessoa.getEndereco().length() > 50)) {
			ret = false;

		} else if (pessoa.getTelefone()!=null&&(pessoa.getTelefone().equals("") || pessoa.getTelefone().length() > 20)) {
			ret = false;

		} else if (pessoa.getDddTelefone()!=null&&(!ehNumero(pessoa.getDddTelefone()) && (pessoa.getDddTelefone().length() != 2))) {

			ret = false;

		} else if (pessoa.getDataNascimentoDia().isEmpty() || (!ehNumero(pessoa.getDataNascimentoDia())
				|| (getNumero(pessoa.getDataNascimentoDia()) < 30 || getNumero(pessoa.getDataNascimentoAno()) > 30))) {

			ret = false;

		} else if (pessoa.getDataNascimentoMes().isEmpty() || (!ehNumero(pessoa.getDataNascimentoMes())
				|| (getNumero(pessoa.getDataNascimentoMes()) < 1 || getNumero(pessoa.getDataNascimentoMes()) > 12))) {

			ret = false;

		} else if (pessoa.getDataNascimentoAno().isEmpty()
				|| (!ehNumero(pessoa.getDataNascimentoAno()) || (getNumero(pessoa.getDataNascimentoAno()) < 1900
						|| getNumero(pessoa.getDataNascimentoAno()) > LocalDateTime.now().getYear()))) {

			ret = false;

		} else if (pessoa.getSexo().isEmpty() || pessoa.getSexo() != "m" || pessoa.getSexo() != "f") {
			ret = false;
		}

		return ret;
	}

	private double getNumero(String numero) {
		return Double.parseDouble(numero);
	}

	private boolean ehNumero(String numero) {
		boolean ret = true;
		try {
			Double.parseDouble(numero);
		} catch (Exception e) {
			ret = false;
		}
		return ret;
	}

}
