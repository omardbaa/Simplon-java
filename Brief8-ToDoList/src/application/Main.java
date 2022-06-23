package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/Task.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/controllers/application.css").toExternalForm());
			primaryStage.setScene(scene);
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setTitle("TASK TO DO");

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
