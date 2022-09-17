package soussHealthOnlineStore.entities;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Inheritance(strategy = InheritanceType.JOINED)
public  class Users {
     
	   @Id
@GeneratedValue(strategy = GenerationType.TABLE)

    private Long id;
	
	   
	private String nom;  
	
	private String prenom; 
	 
	
	private String username;  
	 
	
	 @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password; 
	
	
	private String email; 
	
	private String label;

	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<AppRole> appRoles ;

	  public void save(AppRole role) {
	        this.appRoles.add(role);
	}
	 
}
