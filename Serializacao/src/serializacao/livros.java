package serializacao;

public class livros implements java.io.Serializable{
	private int paginas;
	private String nome;
	private String autor;
	public livros(int paginas, String nome, String autor) {
		this.paginas = paginas;
 		this.nome = nome;
 		this.autor = autor;	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString(){
		return "Livros [paginas=" + paginas + ", nome=" + nome + ", autor="+ autor + "]";
	} 

}
