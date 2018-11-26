package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class loginController implements Initializable{

    @FXML
    private CheckBox carro;

    @FXML
    private ComboBox<?> ano;

    @FXML
    private Button login;

    @FXML
    private TextField email;

    @FXML
    private CheckBox moto;

    @Override
    public void initialize(URL location, ResourceBundle resources){
    	
    }
    
}