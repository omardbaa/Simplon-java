package soussHealthOnlineStore.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "commands")

@NoArgsConstructor @AllArgsConstructor @ToString
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
 
		 property = "command_id")
public class Command {
	@Id
	
	private Long command_id;
	private Date date_command;
	private Double prixTotal;
	
	
	

	 @ManyToOne( cascade = CascadeType.ALL,targetEntity = Client.class, fetch = FetchType.EAGER)
	  private Client client;
	 
	 @ManyToOne(cascade = CascadeType.ALL,targetEntity = Produit.class, fetch = FetchType.EAGER)
	 private Produit produit;
	 
	 

}
