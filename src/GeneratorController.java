import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.event.*;

@SuppressWarnings("restriction")
public class GeneratorController extends Application{

    @FXML
    public Button generateBtn;

    @FXML
    public TextArea textBox;
    
	@FXML
	public void generate(ActionEvent event) throws IOException{
		Main.main(null);
		int n = Main.getNumber();
		String s = Integer.toString(n);
		textBox.setText(s);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Generator.fxml"));
		stage.setTitle("Generator");
		stage.setScene(new Scene(root));
		stage.setResizable(false);
		stage.show();
	}
	
	/*public void main(String[] args) {
		launch(args);
	}*/
}