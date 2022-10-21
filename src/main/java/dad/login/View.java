package dad.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class View extends GridPane {

	private TextField user;
	
	private PasswordField password;
	private Button enviar;
	private Button cancelar;
	private CheckBox usarLDAP;
	private HBox hbox;

	public View() {
		super();

		user = new TextField();
		password = new PasswordField();
		enviar = new Button();
		usarLDAP= new CheckBox("Usar LDAP");
		enviar.setText("Enviar");
		cancelar = new Button();
		cancelar.setText("Cancelar");
		hbox = new HBox(5,enviar,cancelar);
		
		

		add(new Label("Usuario: "), 0, 0);
		add(user, 1, 0);
		add(new Label("Contraseña: "), 0, 1);
		add(password, 1, 1);
		add(usarLDAP,1,2);
		add(hbox,1,3);

		setPadding(new Insets(10, 10, 10, 10));
		setVgap(15);
		setHgap(45);
		setAlignment(Pos.CENTER);
	}

	public TextField getUser() {
		return user;
	}

	public PasswordField getPassword() {
		return password;
	}

	public Button getEnviar() {
		return enviar;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public CheckBox getUsarLDAP() {
		return usarLDAP;
	}
	
}
