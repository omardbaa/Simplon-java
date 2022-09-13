package soussHealthOnlineStore.entities;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "users")

@NoArgsConstructor @AllArgsConstructor @ToString
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
		 property = "id")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  class Users {
     
	   @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
	
	 @NotEmpty   
	private String nom;  
	 @NotEmpty 
	private String prenom; 
	 
	 @NotEmpty 
	private String login;  
	 
	 @NotEmpty 
	private String password; 
	 
	 @NotEmpty 
	private String email; 
	
	@Enumerated(value = EnumType.STRING)
	private Label label;

}
