package dad.login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	 StringProperty user,pass;
	 
	 public Model() {
		user=new SimpleStringProperty();
		pass=new SimpleStringProperty();
	}

	public final StringProperty userProperty() {
		return this.user;
	}
	

	public final String getUser() {
		return this.userProperty().get();
	}
	

	public final void setUser(final String user) {
		this.userProperty().set(user);
	}
	

	public final StringProperty passProperty() {
		return this.pass;
	}
	

	public final String getPass() {
		return this.passProperty().get();
	}
	

	public final void setPass(final String pass) {
		this.passProperty().set(pass);
	}
	
	 
}
