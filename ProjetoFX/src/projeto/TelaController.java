package projeto;
import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class TelaController implements Initializable{

	    @FXML
	    private Button btnOk;

	    @FXML
	    private TextField txtNome;

	    @FXML
	    private TextField txtEmail;

	    @Override
	    public void initialize(URL location, ResourceBundle resources){
	    	btnOk.setOnAction((event) ->  {
	    		System.out.println(txtNome.getText() + " " + txtEmail.getText());
	    	});
	    }
	    	
}



