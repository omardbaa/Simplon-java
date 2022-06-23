package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Task;
import model.dao.TaskDAO;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;

public class AddTaskController implements Initializable {
	private TaskDAO taskDao = new TaskDAO();
    public Task task;
    
    private Stage stage;
    private Scene scene ;
    
    
    
    private String [] TaskStatus = {"On progress", "Done","Not yet" };
	private String [] Category = {"Presentation", "Standby topic","Brief" ,"Research"};

    
	@FXML
	private ChoiceBox<String> ChoiceBxStatus;
	@FXML
	private TextField tfTitle;
	@FXML
	private TextField tfDescription;
	@FXML
	private Button btCreate;
	@FXML
	private TextField tfDeadline;
	@FXML
	private ChoiceBox<String> ChoiceBxCategory;
	@FXML
	private Button Cancel;
	
	@FXML
	private TableColumn<Task, String> StatusColumn;
	@FXML
	private TableColumn<Task, String> CategoryColumn;

	// Event Listener on Button[#btCreate].onAction
	@FXML
	public void create(ActionEvent event) throws SQLException, IOException {

		Task task = new Task(tfTitle.getText(),tfDescription.getText(),ChoiceBxStatus.getValue(), tfDeadline.getText(), ChoiceBxCategory.getValue());	
		taskDao.create(task);
		 System.out.println("Task has been created successfully" );
		 
		 TasksDashboard(event);
		
	
	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ChoiceBxStatus.getItems().addAll(TaskStatus);
		//ChoiceBxStatus.setOnAction(this::getTaskStatus);
		ChoiceBxCategory.getItems().addAll(Category);
		//ChoiceBxCategory.setOnAction(this::getCategory);
		
	}
	
		public void getCategory (ActionEvent event) {
			String Category =ChoiceBxCategory.getValue();
			CategoryColumn.setText(Category);
			}
	
		public void getTaskStatus (ActionEvent event) {
				String taskStatus =ChoiceBxStatus.getValue();
				StatusColumn.setText(taskStatus);
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
		
		

}



















