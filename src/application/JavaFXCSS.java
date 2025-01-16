package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXCSS extends Application{
	public static void main(String [] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("CSS.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		
//		String css = this.getClass().getResource("application.css").toExternalForm();
//		scene.getStylesheets().add(css);
//		scene1sheet..css.
		stage.setScene(scene);
		stage.show();
	}

}
