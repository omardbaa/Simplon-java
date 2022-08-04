package GestionEmploye.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Admin {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String FullName;
	private String Email;
	private String Password;
	
	
}
