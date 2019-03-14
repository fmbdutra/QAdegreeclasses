import java.util.ArrayList;
import java.util.List;

public class BancoDados {

	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public boolean salvarPessoa(Pessoa pessoa) {		
		if(pessoa.getSalario() < 10000 
				&& pessoa.getNome().equals("") == false) {	
			System.out.println("salvo no banco");
			 lista.add(pessoa);
		    return true;
		}else {
			System.out.println("nao salvo no banco");
			return false;
		}	
	}
		
	public String listarPrimeiroPessoas() {
		StringBuilder message = new StringBuilder();
		// pega os 5 primeiros caracteres
		for(Pessoa pessoa : lista) {
			message.append(pessoa.getNome().substring(0, 4)).append("\n");
		}
		
		return message.toString();
	}

	public List<Pessoa> getPessoas() {
		return lista;		
	}
	
	
}
