package serializacao;

import javax.management.loading.PrivateClassLoader;

public class Tenis implements java.io.Serializable{
	 	private int tamanho;
	 	private String Marca;
	 	private String modelo;
	 	public Tenis(int tamanho, String Marca, String modelo){
	 		this.tamanho = tamanho;
	 		this.Marca = Marca;
	 		this.modelo = modelo;
	 	}
		public int getTamanho() {
			return tamanho;
		}
		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		@Override
		public String toString(){
			return "Tenis [tamanho=" + tamanho + ", marca=" + Marca + ", modelo="+ "]";
		} 
}
