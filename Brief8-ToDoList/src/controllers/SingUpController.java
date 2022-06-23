package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.User;
import model.dao.UserDAO;
import javafx.scene.control.PasswordField;

public class SingUpController implements Initializable {
	
	private Stage stage;
	private Scene scene ;
	
	UserDAO userDao = new UserDAO();	
	
	@FXML
	private Button SingupSubmit;
	@FXML
	private Button LogInBtn;
	@FXML
	private TextField tfUserName;
	@FXML
	private TextField tfFirstName;
	@FXML
	private TextField tfLastName;
	@FXML
	private PasswordField psPassWord;
	@FXML
	private ImageView ToDoImgView;
	@FXML
	private ImageView SingUpImg;
	
	@FXML
	private Label SingupMessage;
	

	// Event Listener on Button[#SingupSubmit].onAction
	@FXML
	public void SingUpMessageOnAction(ActionEvent event) throws SQLException, IOException {
		User user = new User(tfFirstName.getText(),tfLastName.getText(),tfUserName.getText(), psPassWord.getText());
		System.out.println(userDao.create(user));

			
			if (tfFirstName.getText().isEmpty() && tfLastName.getText().isEmpty() && tfUserName.getText().isEmpty() && psPassWord.getText().isBlank()){
				SingupMessage.setText("Invalid Rogestration. Please try again.");
		
				
			}
			else {
				LogInStageForm(event);
			}
			}
	

	
	
	
	
	
	// Event Listener on Button[#LogInBtn].onAction
		@FXML
		public void LogInStageForm(ActionEvent event) throws IOException {

			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/SingIn.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root, 740, 470);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("Log in");
			stage.setMaxWidth(740);
			stage.setMaxHeight(470);
			stage.setMinWidth(740);
			stage.setMinHeight(470);
			stage.show();
		}	

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		
		
	}
}
