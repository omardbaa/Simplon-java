package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;

public class WelcomingController {
	@FXML
	private Button LogInBtn;
	@FXML
	private Button SingupSubmit;
	
	   private Stage stage;
	   private Scene scene;

	// Event Listener on Button[#LogInBtn].onAction
	@FXML
	public void LogInStageForm(ActionEvent event) throws IOException {

		BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/SingIn.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root, 750, 535);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		//primaryStage.initStyle(StageStyle.UNDECORATED);
		stage.setTitle("TASK TO DO");
		stage.setMaxWidth(750);
		stage.setMaxHeight(535);
		stage.setMinWidth(750);
		stage.setMinHeight(535);
		stage.show();
	}	
	
	// Event Listener on Button[#SingupSubmit].onAction
	@FXML
	public void SingupStageForm(ActionEvent event) throws IOException {
		
			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/SingUp.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root, 750, 535);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("TASK TO DO");
			stage.setMaxWidth(750);
			stage.setMaxHeight(535);
			stage.setMinWidth(750);
			stage.setMinHeight(535);
			stage.show();
		
			
			
			
			
	}
}
