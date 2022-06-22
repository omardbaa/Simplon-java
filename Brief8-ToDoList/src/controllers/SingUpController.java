package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
	public void SingUpMessageOnAction(ActionEvent event) throws SQLException {
		User user = new User(tfFirstName.getText(),tfLastName.getText(),tfUserName.getText(), psPassWord.getText());
		System.out.println(userDao.create(user));

			
			if (tfFirstName.getText().isEmpty() && tfLastName.getText().isEmpty() && tfUserName.getText().isEmpty() && psPassWord.getText().isBlank()){
				SingupMessage.setText("Invalid Rogestration. Please try again.");
		
				
			}
			else {
				LogInStageForm();
			}
			}
	

	
	
	
	
	
	public void LogInStageForm() {
		
		try {
			
			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/SingIn.fxml"));
			Stage SingUpStage = new Stage ();
			Scene scene = new Scene(root, 750, 535);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			SingUpStage.setScene(scene);
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			SingUpStage.setTitle("TASK TO DO");
			SingUpStage.setMaxWidth(750);
			SingUpStage.setMaxHeight(535);
			SingUpStage.setMinWidth(750);
			SingUpStage.setMinHeight(535);
			SingUpStage.show();
		}catch (Exception e) {
			e.printStackTrace();
			e.getCause();
		}	
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		
	}
}
