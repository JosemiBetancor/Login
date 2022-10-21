package dad.login;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Model {
private SimpleStringProperty user = new SimpleStringProperty();
private SimpleStringProperty password = new SimpleStringProperty();
private SimpleBooleanProperty usarLDAP = new SimpleBooleanProperty();

public final SimpleStringProperty userProperty() {
	return this.user;
}

public final String getUser() {
	return this.userProperty().get();
}

public final void setUser(final String user) {
	this.userProperty().set(user);
}

public final SimpleStringProperty passwordProperty() {
	return this.password;
}

public final String getPassword() {
	return this.passwordProperty().get();
}

public final void setPassword(final String password) {
	this.passwordProperty().set(password);
}

public final SimpleBooleanProperty usarLDAPProperty() {
	return this.usarLDAP;
}

public final boolean isUsarLDAP() {
	return this.usarLDAPProperty().get();
}

public final void setUsarLDAP(final boolean usarLDAP) {
	this.usarLDAPProperty().set(usarLDAP);
}



}
