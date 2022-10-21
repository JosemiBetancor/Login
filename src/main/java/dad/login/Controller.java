package dad.login;
import dad.login.auth.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	private View view = new View();
	private Model model = new Model();

	public Controller() {
		// bindings
		model.userProperty().bind(view.getUser().textProperty());
		model.passwordProperty().bind(view.getPassword().textProperty());
		model.usarLDAPProperty().bind(view.getUsarLDAP().selectedProperty());
		view.getEnviar().setOnAction(this::onValidarAction);
		view.getCancelar().setOnAction(this::onCancelarAction);
	

	}
	private void onValidarAction(ActionEvent e) {
	
		try {
			boolean useLdap = model.isUsarLDAP();
			AuthService auth = useLdap ? new LdapAuthService() : new FileAuthService();
			if(auth.login(model.getUser(),model.getPassword())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Iniciar sesion");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son válidas");
				alert.showAndWait();
				App.stage.close();
				
			}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Iniciar sesion");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("Las credenciales de acceso no son válidas");
				alert.showAndWait();
				view.getPassword().setText("");
			}
			
			
		} catch (Exception e1) {
			// TODO: handle exception
		}
		
		
	}
	private void onCancelarAction(ActionEvent e) {
		App.stage.close();
		
	}
	

	public View getview() {
		return view;
	}

	public Model getmodel() {
		return model;
	}
	
}
