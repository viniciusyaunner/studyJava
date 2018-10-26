package serializacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TenisApp extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage palco) throws Exception{
		Parent principal = FXMLLoader.load(getClass().getResource("tenis.fxml"));
		palco.setScene(new Scene(principal));
		palco.show();
	}
}
