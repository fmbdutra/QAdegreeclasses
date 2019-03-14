import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	/*
	 * ALTERA��ES PARA FAZER
	 * 1. Retirar a validacao de valor minimo de caracteres do nome da pessoa
	 * 2. Alterar o valor do limite do sal�rio para 12000
	 * 
	 */
	
	
	
	static BancoDados banco = new BancoDados();
	public static void main(String[] args) {
		
		while(true) {
		String opcao = JOptionPane.showInputDialog(null, 
				"Selecione uma op��o\n1.Salvar\n2.Listar Nomes\n3.Listar sal�rios e descontos\n4.Sair");
			if("1".equals(opcao)) {
				salvar();
			}else if("2".equals(opcao)) {
				listar();
			}else if("3".equals(opcao)) {
				listarSalario();
			}
			else if("4".equals(opcao)) {
				break;
			}else {
				JOptionPane.showMessageDialog(null,"op��o invalida");
			}
		}
			
		
		
	}

	private static void listarSalario() {
		StringBuilder message = new StringBuilder();
		List<Pessoa> list = banco.getPessoas();
		for(Pessoa pessoa : list) {
			float salarioDesconto =  calculaDesconto( pessoa.getSalario());
			message.append("nome: " + pessoa.getNome() + "\n");
			message.append("salario: " + pessoa.getSalario() + "\n");
			message.append("desconto salario: " + salarioDesconto + "\n");
			message.append("------------------------\n");
			
		}
		JOptionPane.showMessageDialog(null,message.toString());
	}

	private static float calculaDesconto(float salario) {
		if(salario < 10000) {
			return salario * 0.02f;
		}
		return 0;
	}

	private static void listar() {
		JOptionPane.showMessageDialog(null,banco.listarPrimeiroPessoas());
		
	}

	private static void salvar() {
		String nome = JOptionPane.showInputDialog(null, "Digite o nome");	
		String salario = JOptionPane.showInputDialog(null, "Digite o salario");		
		
		Pessoa pessoa = new Pessoa();	
		pessoa.setNome(nome);
		pessoa.setSalario(Float.parseFloat(salario));
		boolean ret = validaPessoa(pessoa);
		if(ret == true) {
			boolean retBanco = banco.salvarPessoa(pessoa);
			if(retBanco == true) {
				JOptionPane.showMessageDialog(null, "Pessoa salva com sucesso");
			}else {
				JOptionPane.showMessageDialog(null, "ERROR ao salavar Pessoa");
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Dados invalidos para a pessoa");
		}
		
	}

	// retorna FALSE, se pessoa tiver problemas nos seus dados, ou TRUE, se tudo estiver sido OK.
	static boolean validaPessoa(Pessoa pessoa) {
		boolean ret = false;
		if(pessoa.getNome().equals("") 
				//|| pessoa.getNome().length() < 4 
				) {
			ret = false;
		}else if(pessoa.getSalario() < 0 || pessoa.getSalario() > 10000) {
			ret = false;
		}else {
			return true;
		}
		return ret;
		
	}
	
	
	
}
