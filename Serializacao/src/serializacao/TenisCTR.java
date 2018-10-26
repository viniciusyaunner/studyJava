package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;

public class TenisCTR implements Initializable{
	@FXML private TableView<TenisNaTabela> tabela;
	
	@FXML private TableColumn<TenisNaTabela, Integer> colunaNumero;
	@FXML private TableColumn<TenisNaTabela, String> colunaMarca;
	@FXML private TableColumn<TenisNaTabela, String> colunaModelo;
	
	@FXML private TextField marca;
	@FXML private TextField numero;
	@FXML private TextField modelo;
	
	@FXML private Button adcionar;
	@FXML private Button remover;
	@FXML private Button serializar;
	@FXML private Button deserializar;
	
	

	private void selecionarTenis(){
		TenisNaTabela tenisNaTabela = tabela.getSelectionModel().getSelectedItem();
		Tenis tenis = tenisNaTabela.getTenis();
		
		numero.setText(String.valueOf(tenis.getTamanho()));
		marca.setText(tenis.getMarca());
		modelo.setText(tenis.getModelo());
	}
	
	private void montarTabela(){
		colunaNumero.setCellValueFactory(c -> c.getValue().getNumero().asObject());
		colunaMarca.setCellValueFactory(c -> c.getValue().getMarca());
		colunaModelo.setCellValueFactory(c -> c.getValue().getModelo());
		
		tabela.setOnMouseClicked(m ->{
			selecionarTenis();
		});
		
		tabela.setOnKeyPressed(evt ->{
			if((evt.getCode().equals(KeyCode.DOWN)) || (evt.getCode().equals(KeyCode.UP))){
				selecionarTenis();
			}
		});
	}
	
	
	private static ArrayList<Tenis> deserializaListaTenis(String arquivo){
		FileInputStream arqLeitura = null;
		ObjectInputStream in = null;
		ArrayList<Tenis> lista = null;
		try{
			arqLeitura = new FileInputStream(arquivo);
			in = new ObjectInputStream(arqLeitura);
			lista = (ArrayList<Tenis>) in.readObject();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}finally {
			try{
				arqLeitura.close();
				in.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		return lista;
	}
	
	
	private static void serializaListaTenis(ArrayList<Tenis> listaTenis, String arquivo){
		FileOutputStream arq = null;
		ObjectOutputStream out = null;
		
		try{
			arq = new FileOutputStream(arquivo); 
			out = new ObjectOutputStream(arq);
			out.writeObject(listaTenis);
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			try{
				arq.close();
				out.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
	
	private void codificarBotoes(){
		serializar.setOnAction(s ->{
			ArrayList<Tenis> lista = new ArrayList<>();
			
			for (TenisNaTabela tenisNaTabela : tabela.getItems()){
				lista.add(tenisNaTabela.getTenis());
				
			}
			
			serializaListaTenis(lista, "tenis.dat");
			
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("SERIALIZAÇÂO");
			alerta.setContentText("TENIS SALVO COM SUCESSO");
			alerta.show();
		});
		deserializar.setOnAction(s -> {
			ArrayList<Tenis> lista = deserializaListaTenis("tenis.dat");
			tabela.getItems().clear();
			for(Tenis tenis : lista){
				tabela.getItems().add(new TenisNaTabela(tenis));
			}
			tabela.refresh();
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("DESERIALIZAÇÂO");
			alerta.setContentText("TENIS CARREGADOS COM SUCESSO");
			alerta.show();
		});
		adcionar.setOnAction(a ->{
			Tenis tenis = new Tenis(Integer.valueOf(numero.getText()) , marca.getText() , modelo.getText());
			TenisNaTabela tenisNaTabela = new TenisNaTabela(tenis);
			tabela.getItems().add(tenisNaTabela);
			tabela.refresh();
		});
		remover.setOnAction(r ->{
			int item = tabela.getSelectionModel().getSelectedIndex();
			if(item != -1){
				tabela.getItems().remove(item);
				tabela.refresh();
				tabela.getSelectionModel();
				selecionarTenis();
			}
		});
	}
		
	
	@Override
		public void initialize(URL location, ResourceBundle resources){
			montarTabela();
			codificarBotoes();
		}
}
	

