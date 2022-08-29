package stcManager.security.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AppRole {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long roleId;
	@Column(unique = true)
	private String roleName; 
	
	

}
