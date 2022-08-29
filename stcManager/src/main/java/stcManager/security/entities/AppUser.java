package stcManager.security.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class AppUser {
	@Id 
	
private String userId;
	


@NotEmpty
@Size (min = 4, max = 40)
private String email;

@NotEmpty
@Size (min = 4, max = 40)
@Column(unique = true)
private String username;

@NotEmpty
private String password;

private boolean  active;

@ManyToMany (fetch= FetchType.EAGER)
private List<AppRole> appRoles= new ArrayList<> ();

}
