package controllers;

import java.awt.Event;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Task;
import model.dao.TaskDAO;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class TaskController implements Initializable {
	private TaskDAO taskDao = new TaskDAO();
    public Task task;
    
    private Stage stage;
    private Scene scene;
   
	
	@FXML
	private ChoiceBox<String> ChoiceBxStatus;
	@FXML
	private ChoiceBox<String> ChoiceBxCategory;
	
	private String [] TaskStatus = {"On progress", "Done","Not yet" };
	private String [] Category = {"Presentation", "Standby topic","Brief" ,"Research "};
	
	@FXML
	private  TableView<Task>   TablleView;
	@FXML
	private TableColumn<Task, String> TitleColumn;
	@FXML
	private TableColumn<Task, String> DescriptionColumn;
	@FXML
	private TableColumn<Task, String> StatusColumn;
	@FXML
	private TableColumn<Task, String> DeadlineColumn;
	@FXML
	private TableColumn<Task, String> CategoryColumn;
	@FXML
	private TextField tfTitle;
	@FXML
	private TextField tfDescription;
	@FXML
	private TextField tfDeadline;
	@FXML
	private TextField tfCategory;
	
	
	@FXML
	private Button NewTask;
	
	
	
	@FXML 
	private Button btCreate;
	@FXML
	private Button btnread;
	@FXML
    private Button btndelete;
	@FXML
	private Button btnUpdate;
	
	
	
	


	 private final ObservableList<Task> data =	
		        FXCollections.observableArrayList(
        	//new Task("Brief8","In this task You need to creat a task manger that allow you to creat,update,select and delte tasks","Active", "2022-06-20 11:23:05.984765+01", "Briefs")
		        );
	
	
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
//			ChoiceBxStatus.getItems().addAll(TaskStatus);
//			ChoiceBxStatus.setOnAction(this::getTaskStatus);
//			ChoiceBxCategory.getItems().addAll(Category);
//			ChoiceBxCategory.setOnAction(this::getCategory);
			viewTasks();
		}
		
		
		public void viewTasks() {
			data.addAll(taskDao.getAll());
			TitleColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("Title"));
			DescriptionColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("Description"));
			StatusColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("Status"));
			DeadlineColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("Deadline"));
			CategoryColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("Category"));
			TablleView.setItems(data);
			
             TablleView.refresh(); 
           
		}
		
		//Read
		 @FXML
		 public void read(ActionEvent event) {
		           
		            String Title = "default";
		        			
		            if(taskDao.read(Title) != null) {
		            	TablleView.setItems(data);
		        	}
		            System.out.println("No Selection" );
		 }
		 
		 
		 public void  ClickMous(MouseEvent event ) {
				task= TablleView.getSelectionModel().getSelectedItem();
				tfTitle.setText(task.getTitle());
				tfDescription.setText(task.getDescription());
				ChoiceBxStatus.setValue(task.getStatus());
				tfDeadline.setText(task.getDeadline());
				ChoiceBxCategory.setValue(task.getCategory());
			}
		 
		 
		 
			//Delete
			
			@FXML
			public void delete(ActionEvent event) {
				try {

		             Task task = new  Task(tfTitle.getText());
		             taskDao.delete(task);
		             clear();
		             TablleView.refresh(); 
		             viewTasks();

		        }catch (Exception e) {
		            // TODO: handle exception

		        }
}

			
			 void clear() {
				 tfTitle.setText(null);
//				 tfDescription.setText(null);
				 ChoiceBxStatus.setValue(null);
				 tfDeadline.setText(null);
				 ChoiceBxCategory.setValue(null);

			    }
			
		 
		public void getCategory (ActionEvent event) {
					String Category =ChoiceBxCategory.getValue();
					CategoryColumn.setText(Category);
				}
		public void getTaskStatus (ActionEvent event) {
			String taskStatus =ChoiceBxStatus.getValue();
			StatusColumn.setText(taskStatus);
		}
		
		
		public void NewTask(ActionEvent event) throws IOException {
			
				BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/AddTask.fxml"));
				stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
				Scene scene = new Scene(root, 700, 220);
				stage.setScene(scene);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				//primaryStage.initStyle(StageStyle.UNDECORATED);
				stage.setTitle("New Task");
				stage.setMaxWidth(700);
				stage.setMaxHeight(220);
				stage.setMinWidth(700);
				stage.setMinHeight(220);
				stage.show();
				
		}
		
		
		
		
		public void UpdateTask(ActionEvent event) throws IOException {
			
			BorderPane root = (BorderPane)FXMLLoader.load(Main.class.getResource("/controllers/UpdateTask.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root, 700, 220);
			stage.setScene(scene);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("Update Task");
			stage.setMaxWidth(700);
			stage.setMaxHeight(220);
			stage.setMinWidth(700);
			stage.setMinHeight(220);
			stage.show();
			
	}

}
