package stcManager.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name="activites")
 @NoArgsConstructor @AllArgsConstructor @ToString
 
 @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
		 property = "activiteId")

public class Activite {
	
	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	

	private Long activiteId;
	@NotEmpty
	@Size (min = 2, max = 40)
	private String  titreActivite;
	
	@NotEmpty
	@Size (min = 4, max = 200)
	private String  descriptif ;
	
	@NotEmpty
	@Size (min = 4, max = 40)
	private String  type ;
	
	
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date  dateDebut;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date  dateFin ;
	
	private boolean  active;
	
	
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "refExercice", referencedColumnName = "refExercice")
    private Exercice exercice;
	
	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="responsableId", nullable = true)
    private Responsable responsable;
 
	 @ManyToMany(mappedBy = "participentActivites", fetch = FetchType.EAGER)
		private Collection<Participent> Particpents;

	 
	 
	public Long getActiviteId() {
		return activiteId;
	}

	public void setActiviteId(Long activiteId) {
		this.activiteId = activiteId;
	}

	public String getTitreActivite() {
		return titreActivite;
	}

	public void setTitreActivite(String titreActivite) {
		this.titreActivite = titreActivite;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

//	@JsonIgnore
	public Exercice getExercice() {
		return exercice;
	}

	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Collection<Participent> getParticpents() {
		return Particpents;
	}

	public void setParticpents(Collection<Participent> particpents) {
		Particpents = particpents;
	}

	 


	
}
