package soussHealthOnlineStore.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "clients")

@ToString
@Data @AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(scope = Client.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

//@PrimaryKeyJoinColumn(name = "id")
public class Client extends Users{

		@OneToMany(mappedBy = "client", targetEntity = Command.class, fetch = FetchType.LAZY)
		private Collection<Command> commands;
		
		
		@ManyToMany(fetch = FetchType.EAGER)
		private Collection<AppRole> appRoles ;
		  

}
