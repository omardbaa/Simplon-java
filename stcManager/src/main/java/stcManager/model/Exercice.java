package stcManager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table (name="exercices")

 @NoArgsConstructor @AllArgsConstructor @ToString
 
 @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
 property = "refExercice")


public class Exercice {

	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long refExercice;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy")
	private Date annee;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date  dateDebut;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private Date  dateFin ;
	
	
	@NotEmpty
	@Size (min = 2, max = 40)
	private String statut;
	
	
	@OneToOne(mappedBy = "exercice")
	@JoinColumn(name="activiteId",referencedColumnName = "refExercice")
	
	private Activite activite;


	public Long getRefExercice() {
		return refExercice;
	}


	public void setRefExercice(Long refExercice) {
		this.refExercice = refExercice;
	}


	public Date getAnnee() {
		return annee;
	}


	public void setAnnee(Date annee) {
		this.annee = annee;
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


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public Activite getActivite() {
		return activite;
	}


	public void setActivite(Activite activite) {
		this.activite = activite;
	}
	
	
	
	

	
}
