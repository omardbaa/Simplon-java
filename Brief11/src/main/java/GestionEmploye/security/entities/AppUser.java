package GestionEmploye.security.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class AppUser {
	@Id 
	
private String userId;
	
@Column(unique = true)
private String username;

private String password;

private boolean  active;

@ManyToMany (fetch= FetchType.EAGER)
private List<AppRole> appRoles= new ArrayList<> ();

}
