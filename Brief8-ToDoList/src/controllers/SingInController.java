package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import application.Main;
import connection.DBConnect;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;


public class SingInController implements Initializable{
	
	 private Stage stage;
	   private Scene scene;
	
	@FXML
	private TextField UserName;
	@FXML
	private PasswordField PassWord;
	@FXML
	private Button LoginSubmit;
	@FXML
	private Button SingupSubmit;
	
	@FXML
	private Label logingMessage;
	

	public void logingMessageOnAction (ActionEvent event) throws SQLException {
	
	
	if (UserName.getText().isBlank()== false && PassWord.getText().isBlank()== false){
		//logingMessage.setText("You try to log in");
		loginValidation("UserName");
	}
	else {
		logingMessage.setText("Please inter username and password");
	}
	}
	
	public void loginValidation(String columnIndex) throws SQLException {
		Connection Connect =  DBConnect.getInstance();
		
		
		String verifyLogin = "select UserName from Userr where UserName = '" + UserName.getText() + "' AND PassWord = '" + PassWord.getText() + "'";
	try {
		
		Statement st = Connect.createStatement();
		ResultSet queryResult = st.executeQuery(verifyLogin);
		
		while(queryResult.next()) {
			if(queryResult.getString(columnIndex= "UserName") == "UserName") {
				logingMessage.setText("Invalid login. Please try again.");
			
			}else {
				//logingMessage.setText("Welcome to TASK TO DO ");	
				TasksDashboard(null);
	
			}
		}
	} catch (Exception e) {
	e.printStackTrace();
	}	
	}
	public void TasksDashboard(ActionEvent event) throws IOException {
		
		BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/Task.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root, 1000, 610);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		//primaryStage.initStyle(StageStyle.UNDECORATED);
		stage.setTitle("TASK TO DO");
		stage.setMaxWidth(1000);
		stage.setMaxHeight(610);
		stage.setMinWidth(1000);
		stage.setMinHeight(610);
		stage.show();
		
}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		
	}
}
