package dad.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends GridPane {

	private TextField userText;
	private PasswordField passText;
	private Button loginButton,cancelButton;
	
	public View() {
		userText=new TextField();
		
		passText=new PasswordField();
		
		loginButton=new Button("Inicio");
		
		cancelButton=new Button("Cancelar");
		
		
		this.addRow(0,new Label("Usuario:"),userText);
		this.addRow(1,new Label("Contraseña"),passText);
		this.add(new HBox(5,loginButton,cancelButton),1,2);
		this.setPadding(new Insets(10,10,10,10));
		this.setVgap(5);
		this.setAlignment(Pos.CENTER);
	}

	public TextField getUserText() {
		return userText;
	}

	public PasswordField getPassText() {
		return passText;
	}

	public Button getLoginButton() {
		return loginButton;
	}

	public Button getCancelButton() {
		return cancelButton;
	}
	
	
}
