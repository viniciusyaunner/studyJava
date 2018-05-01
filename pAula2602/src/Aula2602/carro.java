package Aula2602;

public class carro {
	private String nome;
	private String ano;
	private String marca;
	private String kilometragem;
	public carro(){
		this("","","","");
	}
	public carro(String nome,String ano, String marca, String kilometragem){
		 this.nome = nome;
		 this.ano =  ano;
		 this.marca = marca;
		 this.kilometragem = kilometragem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(String kilometragem) {
		this.kilometragem = kilometragem;
	}
	public void apresentarCarro(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Kilometragem: " + this.getKilometragem());

	}
}
