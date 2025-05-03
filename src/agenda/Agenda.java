package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Pessoa> pessoas;

	public Agenda() {
		pessoas = new ArrayList<Pessoa>();
	}

	public void adicionar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void remover(String nome) {
		for (Pessoa p : pessoas) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				pessoas.remove(p);
				break;
			}
		}
	}

	public void editar(Pessoa pessoa) {
		for (Pessoa p : pessoas) {
			if (p.getNome().equalsIgnoreCase(pessoa.getNome())) {
				p = pessoa;
				break;
			}
		}
	}
	
	public List<Pessoa> listarContatos(){
		return pessoas;
		
	}
		

}
