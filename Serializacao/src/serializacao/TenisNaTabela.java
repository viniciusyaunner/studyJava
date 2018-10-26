package serializacao;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TenisNaTabela {
	private SimpleIntegerProperty numero;
	private SimpleStringProperty marca;
	private SimpleStringProperty modelo;
	private Tenis tenis;
	
	public TenisNaTabela(Tenis tenis){
		this.tenis = tenis;
		this.numero = new SimpleIntegerProperty(tenis.getTamanho());
		this.marca = new SimpleStringProperty(tenis.getMarca());
		this.modelo = new SimpleStringProperty(tenis.getModelo());
		
	}

	public SimpleIntegerProperty getNumero() {
		return numero;
	}

	public void setNumero(SimpleIntegerProperty numero) {
		this.numero = numero;
	}

	public SimpleStringProperty getMarca() {
		return marca;
	}

	public void setMarca(SimpleStringProperty marca) {
		this.marca = marca;
	}

	public SimpleStringProperty getModelo() {
		return modelo;
	}

	public void setModelo(SimpleStringProperty modelo) {
		this.modelo = modelo;
	}

	public Tenis getTenis() {
		return tenis;
	}

	public void setTenis(Tenis tenis) {
		this.tenis = tenis;
	}

}
