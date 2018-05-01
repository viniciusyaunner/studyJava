package Aula2602;

public class pessoa {
	//atributos
	private String nome;
	private String endereco;
	private String telefone;
	public  pessoa(){
		this("","","");
	}
	public pessoa(String nome,String endereco, String telefone){
		 this.nome = nome;
		 this.endereco =  endereco;
		 this.telefone = telefone;
	}
	//aponte o mouse abaixo da declaração de atributos 
	//botão direito/source/generate getter e setter
	//clique no botão select all/ok
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void apresentarPessoa(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
	}
}
