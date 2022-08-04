package GestionEmploye.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name="employee")
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Employe {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	
	private String Nom;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String Prenom;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date DatNaissance;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String Role;
	
	
	
	

}
