package agenda;


public class Pessoa {
	
	private String nome;
	private String telefone;
	
	//Construtores
	
	public Pessoa() {}
	 
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	
	//fim Construtores
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + "]";
	}

	//metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//fim metodos get e set

}
