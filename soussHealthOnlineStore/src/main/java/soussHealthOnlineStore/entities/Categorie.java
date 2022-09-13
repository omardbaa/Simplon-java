package soussHealthOnlineStore.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "categories")

@NoArgsConstructor @AllArgsConstructor @ToString

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
		 property = "categoryId")
public class Categorie {

	   @Id
	

	private Long categoryId;
	
	@NotEmpty 
	private String titre;

	@NotEmpty 
	private String descriptif;
	
	
//@Transient
	 
	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
		private Collection<Produit> produits;


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescriptif() {
		return descriptif;
	}


	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}


	public Collection<Produit> getProduits() {
		return produits;
	}


	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	
}
