package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class login extends Application{
	public static void main(String[] args){
		launch(args);
	}	
	@Override
	public void start(Stage palco) throws Exception{
		Parent principal = FXMLLoader.load(getClass().getResource("loginApp.fxml"));
		Scene cena = new Scene(principal);
		palco.setScene(cena);
		palco.show();
	}
}
