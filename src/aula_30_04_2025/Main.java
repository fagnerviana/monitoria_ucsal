package aula_30_04_2025;

import agenda.Agenda;
import agenda.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		//Instanciando Agenda 
		Agenda agenda = new Agenda();
		
		//adicionando a pessoa a lista
		agenda.adicionar(new Pessoa("Kuririm","719999999"));
		agenda.adicionar(new Pessoa("Goku","111111111"));
		agenda.adicionar(new Pessoa("Saitama","222222222"));
		
		
		for (Pessoa pessoa :agenda.listarContatos()) {
			System.out.println(pessoa);
		}
				
	}

}
