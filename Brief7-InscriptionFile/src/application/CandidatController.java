package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dao.CandidatDAO;
import domain.Candidat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CandidatController implements Initializable {
	private CandidatDAO candidatDao = new CandidatDAO();

	@FXML
	private TextField lastname;
	@FXML 
	private Button btCreate;
	
	@FXML
	private TextField id;
	@FXML
	private Button btnread;
	@FXML
    private Button btndelete;
	@FXML
	private Button btnUpdate;
	
	@FXML
	private TextField idCandidat;
	@FXML
	private TextField firstname;
	@FXML
	private TextField email;
	@FXML
	private TextField city;
	@FXML
	private TextField country;
	@FXML
	private TextField adresse;
	@FXML
	private  TableView<Candidat>   tableView;
	@FXML
	private  TableColumn<Candidat,Integer>   clmnIdCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnNomCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnPrenomCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnEmailCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnAdresseCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnVilleCandidat;
	@FXML
	private  TableColumn<Candidat,String>   clmnPaysCandidat;
	
	@FXML
	public void create(ActionEvent event) throws SQLException {
		Candidat  candidat1 = new Candidat( idCandidat.getAnchor(),    firstname.getText(),lastname.getText() , email.getText(), adresse.getText(), city.getText(),country.getText() );
		candidatDao.create(candidat1);
//		if(candidatDao.create(candidat1) !=null) {
		data.addAll(candidatDao.getAll());
		tableView.refresh();
     	candidatDao.getAll();	
//		}
	}
	
    private final ObservableList<Candidat> data =	
        FXCollections.observableArrayList(
        	new Candidat(6,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
        	new Candidat(7,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
        	new Candidat(8,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
        	new Candidat(9,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
        	new Candidat(10,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc")
                       
        );
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		viewCandidats();
		
		
	}
	public void viewCandidats() {
		data.addAll(candidatDao.getAll());
		clmnIdCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, Integer>("IdCandidat"));
		clmnNomCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("NomCandidat"));
		clmnPrenomCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("PrenomCandidat"));
		clmnEmailCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("EmailCandidat"));
		clmnAdresseCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("AdresseCandidat"));
		clmnVilleCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("VilleCandidat"));
		clmnPaysCandidat.setCellValueFactory(new PropertyValueFactory<Candidat, String>("PaysCandidat"));
		tableView.setItems(data);
		
	}
	 @FXML
	 public void read(ActionEvent event) {
	            candidatDao.read(1);
	      
	
		 
	 }
	
	
	
	@FXML
	public void delete(ActionEvent event) {

			Candidat  candidat = tableView.getSelectionModel().getSelectedItem();
			if(candidatDao.delete(candidat.getIdCandidat())){
			if(candidat!=null)
			data.remove(data.indexOf(candidat));
		    }		
		int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
	    if (selectedIndex >= 0) {
	        tableView.getItems().remove(selectedIndex);

	    } else {
	       
	        Alert alert = new Alert(AlertType.WARNING);
	        alert.setTitle("No Candidate Has been selected");
	        alert.setHeaderText("No candidate Selected");
	        alert.setContentText("Please select a Candidat in the table.");
	        alert.showAndWait();            

	    }
		
		
	}
	
	@FXML
	public void update(ActionEvent event) throws SQLException {
		
		Candidat  candidat1 = new Candidat( idCandidat.getAnchor(), firstname.getText(),lastname.getText() , email.getText(), adresse.getText(), city.getText(),country.getText() );
		candidatDao.update(0, candidat1);
	           
	        }
	
	}
