package dad.login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;



import javafx.scene.control.Alert;

public class Control {

	View root=new View();
	Model model=new Model();
	
	public Control() {
		
		model.userProperty().bind(root.getUserText().textProperty());
		model.passProperty().bind(root.getPassText().textProperty());
	
		root.getLoginButton().setOnAction(event -> {
			
			BufferedReader br = null;
			 Boolean flag=false;
	        String SEPARATOR=",";
		      try {
		         br =new BufferedReader(new FileReader("user.csv"));
		         String line = br.readLine();
		        
		         while (null!=line) {
		            String [] fields = line.split(SEPARATOR); 
		            if (fields[0].equals(model.getUser()) && fields[1].equals(DigestUtils.md5Hex(model.getPass()).toUpperCase())) { flag=true;}
		    
		            
		            line = br.readLine();
		         }
		         
		      } catch (Exception e) {
		         System.out.println("ERROR");
		      } finally {
		         if (null!=br) {
		            try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		         }}
			if (flag==true) {
				Alert alert=new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("LoginApp");
				alert.setHeaderText("Correcto");
				alert.setContentText("Credenciales validas");
				alert.showAndWait();
			} else
			{
				Alert alert=new Alert(Alert.AlertType.ERROR);
				alert.setTitle("LoginApp");
				alert.setHeaderText("Denegado");
				alert.setContentText("usuario o contraseña erroneos");
				alert.showAndWait();
			}
		});
		
	}
	
	public View getRoot() {
		return root;
	}
}
