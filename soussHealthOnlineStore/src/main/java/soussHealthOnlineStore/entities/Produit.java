package soussHealthOnlineStore.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "produits")

@NoArgsConstructor @AllArgsConstructor @ToString
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
		 property = "produitId")
public class Produit {

	
	   @Id
	  

	
	private Long produitId;

	@NotEmpty 
	private String name;

	@NotEmpty 
	private String descriptif;
	@NotEmpty 
	private String country;
	
	
	private Double prix;

	
	
	
//	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name="categoryId", nullable = true)
//	private Categorie categorie;

	 @ManyToOne(cascade = CascadeType.ALL, targetEntity = Categorie.class, fetch = FetchType.LAZY)
	    @JoinColumn(name = "categoryId", insertable = false, updatable = false)
	    @JsonIgnore
	    private Categorie categorie;
	    @Column(name = "categoryId")
	    private Long categoryId;
	    
	    @OneToMany(mappedBy = "produit", targetEntity = Command.class, fetch = FetchType.EAGER)
		private Collection<Command> command;

}
