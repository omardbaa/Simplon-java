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
import javafx.scene.input.MouseEvent;

public class CandidatController implements Initializable {
	private CandidatDAO candidatDao = new CandidatDAO();
    public Candidat candidat;
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
	
	
	
	
	//Create
	
	@FXML
	public void create(ActionEvent event) throws SQLException {
		
		
     int IdCandidat  = Integer.parseInt(idCandidat.getText());
	 Candidat candidat = new Candidat();
     candidat.setIdCandidat(IdCandidat);
		 
	candidat.setNomCandidat(firstname.getText());
	candidat.setPrenomCandidat(lastname.getText());
	candidat.setEmailCandidat(email.getText());
	candidat.setAdresseCandidat(adresse.getText());
	candidat.setVilleCandidat(city.getText());
	candidat.setPaysCandidat(country.getText());
	candidatDao.create(candidat);
	 System.out.println("Candidate has been created successfully" );
	 
	data.addAll(candidatDao.getAll());
	tableView.refresh();
  	candidatDao.getAll();
//    if(candidatDao.create(candidat) !=null) {
//		data.addAll(candidatDao.getAll());
//		tableView.refresh();
//     	candidatDao.getAll();	
//		}
	}
	
    private final ObservableList<Candidat> data =	
        FXCollections.observableArrayList(
//        	new Candidat(6,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
//        	new Candidat(7,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
//        	new Candidat(8,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
//        	new Candidat(9,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc"),
//        	new Candidat(10,"NOM","PRENOME","NOM.PRENOM@gmail.com", "Tilila-Agadir","Agadir","Maroc")
//                       
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
	
	//Read
	 @FXML
	 public void read(ActionEvent event) {
	           
	            int idCandidat = 0;
	        			
	            if(candidatDao.read(idCandidat) != null) {
	         	tableView.setItems(data);
	        	}
	            System.out.println("No Selection" );
	 }
	 
	 
	 
	 
	 public void  ClickMous(MouseEvent event ) {
			candidat= tableView.getSelectionModel().getSelectedItem();
			id.setText(String.valueOf(candidat.getIdCandidat()));
			firstname.setText(candidat.getNomCandidat());
			lastname.setText(candidat.getPrenomCandidat());
			email.setText(candidat.getEmailCandidat());
			adresse.setText(candidat.getAdresseCandidat());
			city.setText(candidat.getVilleCandidat());
			country.setText(candidat.getPaysCandidat());
		}
	
	 
	 //Update

	@FXML
	public void update(ActionEvent event) throws SQLException {
		
		 int IdCandidat  = Integer.parseInt(idCandidat.getText());
		 Candidat candidat = new Candidat();
		 candidat.setIdCandidat(IdCandidat);
		 
	candidat.setNomCandidat(firstname.getText());
	candidat.setPrenomCandidat(lastname.getText());
	candidat.setEmailCandidat(email.getText());
	candidat.setAdresseCandidat(adresse.getText());
	candidat.setVilleCandidat(city.getText());
	candidat.setPaysCandidat(country.getText());
	candidatDao.update( IdCandidat, candidat); 
	viewCandidats();
	System.out.println("Candidate has been updated successfully" );
	}
	
	
	
	//Delete
	
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
	
	
	
	 void clear() {
		 idCandidat.setText(null);
		 firstname.setText(null);
		 lastname.setText(null);
		 email.setText(null);
		 adresse.setText(null);
		 city.setText(null);
		 country.setText(null);

	    }
	
	
	
	}

