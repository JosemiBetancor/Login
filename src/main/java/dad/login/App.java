package dad.login;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	Controller controller;
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		controller = new Controller();
		Scene escena = new Scene(controller.getview(), 320, 200);
		stage= new Stage();
		stage.setTitle("Inicio de sesión");
		stage.setScene(escena);
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
