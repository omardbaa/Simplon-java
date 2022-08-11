package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name="students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@ManyToMany
    @JoinTable( name = "T_Cours_Students_Associations",
                joinColumns = @JoinColumn( name = "IdStudent" ),
                inverseJoinColumns = @JoinColumn( name = "IdCours" ) )
    private List<Cours> cours = new ArrayList<>();
	

	


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	
	

}
