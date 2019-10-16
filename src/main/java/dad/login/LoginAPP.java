package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginAPP extends Application {

		private Control root=new Control();
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Scene scene=new Scene(root.getRoot(),320,200);
		primaryStage.setTitle("LoginApp");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
		
	
}
