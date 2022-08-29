package stcManager.model;



import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table (name="participents")
@NoArgsConstructor @AllArgsConstructor @ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,

property = "participentId")

public class Participent {
	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long participentId;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	@Column(unique = true)
	private String fullName;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String domaine;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String email;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String telephone;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String structure;


	
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinTable(name = "participents_activites", joinColumns = { @JoinColumn(name = "participentId") }, 
	inverseJoinColumns = { @JoinColumn(name = "activiteId") })
	private Collection<Activite> participentActivites;



	public Long getParticipentId() {
		return participentId;
	}



	public void setParticipentId(Long participentId) {
		this.participentId = participentId;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getDomaine() {
		return domaine;
	}



	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getStructure() {
		return structure;
	}



	public void setStructure(String structure) {
		this.structure = structure;
	}

//@JsonIgnore

	public Collection<Activite> getParticipentActivites() {
		return participentActivites;
	}



	public void setParticipentActivites(Collection<Activite> participentActivites) {
		this.participentActivites = participentActivites;
	}
	
	
}
